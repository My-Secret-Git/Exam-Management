/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
    function del(questionID){
        //\u4f60\u786e\u5b9a\u8981\u5220\u9664\u5417是"你确定要删除吗"的unicode编码
        if ((confirm("\u4f60\u786e\u5b9a\u8981\u5220\u9664\u5417"))==true){
            window.location=("delete.jsp?questionID="+questionID);
        }
    }


    function toPage(key,pageNO){
        window.location=("list_FenyeChaxun.jsp?key="+key+"&pageNO="+pageNO);
    }

