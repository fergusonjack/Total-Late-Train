
$(document).ready(getTime());

function getTime() {
    $.ajax({
        method: "POST",
        url: "getFile.php",
        data: { datas:"Selly" }
    })
        .done(function( msg ) {
            $(".time").html(msg);
        });

    console.log("jack");
    setTimeout(getTime,1000);
}