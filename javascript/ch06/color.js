var Body = {
    setColor:function(color){
        document.querySelector('body').style.color = color;
    },
    setBackgroundColr:function(color){
        document.querySelector('body').style.backgroundColor = color;
    }
}
var Links = {
    setColor:function(color){
        var alist = document.querySelectorAll('a');
        for(var i=0;i<alist.length;i++){
        alist[i].style.color = color;
        }
    }
}

function nightDayHandler(self){
    if(self.value === 'night'){
        Body.setBackgroundColr('black');
        Body.setColor('white');
        self.value = 'day';
        Links.setColor('powderblue');
    }else{
        Body.setBackgroundColr('white');
        Body.setColor('black');
        self.value = 'night';
        Links.setColor('blue');
    }
}