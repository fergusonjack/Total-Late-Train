
$(document).ready(getTime());

function getTime() {
    $.ajax({
        method: "POST",
        url: "getFile.php",
        data: { datas:"Selly" }
    })
        .done(function( msg ) {
            $(".time").html("Delay (hr:min): " + msg);
        });

    console.log("jack");
    setTimeout(getTime,1000);
}