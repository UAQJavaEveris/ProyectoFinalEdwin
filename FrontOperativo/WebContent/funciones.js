function nav(dir){
	window.location.href = dir;
}

function openModal(idModal){
	modalWin = document.getElementById(idModal);
	modalWin.style.display = "initial";	
}

function closeModal(idModal){
	modalWin = document.getElementById(idModal);
	modalWin.style.display = "none";

	var inputs = document.getElementsByTagName('input');

    for (var i = 0; i<inputs.length; i++) {
    	if (inputs[i].type == 'text') {
    		inputs[i].value = ''; 
    	}      	  
    }

    var textareas = document.getElementsByTagName('textarea');
    for (var i = 0; i<textareas.length; i++)
    	textareas[i].value = "";
}