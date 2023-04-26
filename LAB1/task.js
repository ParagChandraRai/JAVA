
   function AddTask()
   {
    var txt=document.getElementById("task").value;
	// document.getElementById("txtarea").value=txt;
	 //document.getElementById("task").value="";
	 
	 var content= document.getElementById("txtarea").value;
	  content+=txt+"\n";
	  document.getElementById("txtarea").value=content;
	 
	 for(var i=0;i<content.length;i++)
	 {
		 alert(content.charAt(i));
	 }
   }