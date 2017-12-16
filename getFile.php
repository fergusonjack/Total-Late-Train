<?php

$homepage = file_get_contents('current.txt');

$nums = (int)$homepage;

$hours = (int)($nums/60);
$mins = (int)($nums%60);

echo padderhr($hours) . ":" . paddermin($mins);


function padderhr($num) {
    if ($num < 10){
        return "00" . $num;
    } else if ($num < 100) {
        return "0" . $num;
    } else {
        return $num;
    }
}

function paddermin($num) {
    if ($num < 10){
        return "0" . $num;
    } else {
        return $num;
    }
}
?>