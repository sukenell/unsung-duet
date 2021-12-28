function response(room, msg, sender, isGroupChat, replier, ImageDB, packageName) {

    var ran = Math.random()
    var d10 = Math.floor(ran*10)
    var d6 = Math.floor(ran*6)
    var binder = (d6+1)+(d6+1)
    var shifter = d10+1
    var depth = 5 //이계심도

    if (room.indexOf("언성듀엣")!=-1){
        if (msg.indexOf("/시프트롤")!=-1){
            replier.reply(sifter)
            if(shifter >= depth){
                replier.reply("성공")
            }
            if(shifter < depth){
                replier.reply("실패")
            }
    }
    }

        if (room.indexOf("언성듀엣")!=-1){
        if (msg.indexOf("/바인더롤")!=-1){
            replier.reply(binder)
            if(binder >= depth){
                replier.reply("성공")
            }
            if(binder < depth){
                replier.reply("실패")
            }
    }
    }

    if (room.indexOf("언성듀엣")!=-1){
        if (msg.indexOf("/변이저항")!=-1){
            replier.reply(d6)
    }
    }

}
