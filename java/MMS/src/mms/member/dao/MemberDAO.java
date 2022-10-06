package mms.member.dao;

import static mms.member.db.JdbcUtil.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import mms.member.vo.Member;

public class MemberDAO {
	Connection con;
	
	public MemberDAO(Connection con) {
		// update,delete 같은 작업을 하겠다
		this.con = con;
	}
	
	public int insertMember(Member newMember) {
		int insertCount = 0;
		
		// DB접근, 데이터 읽어오기
		PreparedStatement pstmt = null;
		// 데이터 넣기
		String sql = "insert into member values(member_id_seq.nextval, ?, ?, ?, ?, ?)";
		
		try {
			pstmt = con.prepareStatement(sql);
//			?의 값 설정
			pstmt.setString(1, newMember.getName());
			pstmt.setString(2, newMember.getAddr());
			pstmt.setString(3, newMember.getNation());
			pstmt.setString(4, newMember.getEmail());
			pstmt.setInt(5, newMember.getAge());
			
			// DB에 넣기
			insertCount = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// close
			close(pstmt);
		}
		
		return insertCount;
	}// end insertMember
	
	public ArrayList<Member> selectMemberList(){
		ArrayList<Member> memberList = null;
		PreparedStatement pstmt = null;
		String sql = "select * from member";
		ResultSet rs = null;
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			memberList = new ArrayList<Member>();
			while (rs.next()) {
				// DB에서 읽어온 값
				Member member = new Member(rs.getInt("id"), rs.getString("name"), rs.getString("addr"), rs.getString("nation"),
						rs.getString("email"), rs.getInt("age"));
				memberList.add(member);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstmt);
		}
		return memberList;
	}// end selectMemberList
}// end MemberDAO