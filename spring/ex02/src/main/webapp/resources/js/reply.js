//console.log("Reply Module...");
var replyService = (function(){
	function add(reply, callback, error){
		console.log("add reply.........");
		$.ajax({
			type:'post',
			url:'/replies/new',
			data:JSON.stringify(reply),
			contentType:'application/json;charset=UTF-8',
			success:function(result, status, xhr){
				if(callback){
					callback(result);
				}
			},
			error:function(xhr, status,er){
				if(error){error(er)};
			}
		});
	}//end add
	
	function getList(param, callback, error){
		var bno = param.bno;
		var page = param.page||1;
		$.getJSON("/replies/pages/" + bno+"/" + page + ".json", 
			function(data){
				if(callback){
					callback(data.replyCnt, data.list);
				}
			}).fail(function(xhr, status,er){
				if(error){error(er)};
			});
	}//getList
	
	function remove(rno, callback, error){
		$.ajax({
			type:'delete',
			url:'/replies/' + rno,
			success:function(result, status, xhr){
				if(callback){
					callback(result);
				}
			},
			error:function(xhr, status,er){
				if(error){error(er)};
			}
		});	
	}//remove
	
	function update(reply, callback, error){
		$.ajax({
			type:'put',
			url:'/replies/' + reply.rno,
			data:JSON.stringify(reply),
			contentType:'application/json;charset=UTF-8',
			success:function(result, status, xhr){
				if(callback){
					callback(result);
				}
			},
			error:function(xhr, status,er){
				if(error){error(er)};
			}
		});	
	}
	function get(rno, callback, error){
		$.get("/replies/" + rno + ".json", function(result){
			if(callback){
				callback(result);
			}
		}).fail(function(xhr, status,er){
			if(error){
				error(er);
			}
		});
	}
	
	function displayTime(timeValue) {
		var today = new Date();
		var gap = today.getTime() - timeValue;
		var dateObj = new Date(timeValue);
		var str = "";
		if (gap < (1000 * 60 * 60 * 24)) {
			var hh = dateObj.getHours();
			var mi = dateObj.getMinutes();
			var ss = dateObj.getSeconds();
			
			//시:분:초(01:01:01 or 11:11:11)
			//['01', ':' ,'01',':','01'].join('')
			return [ (hh > 9 ? '' : '0') + hh, ':', (mi > 9 ? '' : '0') + mi,
			':', (ss > 9 ? '' : '0') + ss ].join('');
		} else {
			var yy = dateObj.getFullYear();
			var mm = dateObj.getMonth() + 1; // getMonth() is zero-based
			var dd = dateObj.getDate();
			//년/월/일
			return [ yy, '/', (mm > 9 ? '' : '0') + mm, '/',
			(dd > 9 ? '' : '0') + dd ].join('');
		}
	}
	
	return {
		add:add,
		getList:getList,
		remove:remove,
		update:update,
		get:get,
		displayTime:displayTime};

})();