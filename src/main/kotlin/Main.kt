fun minutToString(agoSecond: Int): String {
    val minut = agoSecond / 60
    val endingMinuts =
        if (minut % 10 == 1 && minut % 100 != 11) "$minut минуту"
        else if (minut % 10 in 2..4) "$minut минуты" else "$minut минут"
    return endingMinuts
}

fun hourToString(agoSecond: Int): String {
    val hour = agoSecond / 60 / 60
    val endingHours =
        if (hour % 10 == 1 && hour % 100 != 11) "$hour час"
        else if (hour % 10 in 2..4) "$hour часа" else "$hour часов"
    return endingHours
}

fun agoToText(agoInt: Int): String {
    val agoText = when (agoInt) {
        in 0..59 -> "только что"
        in 60..60 * 60 -> "${minutToString(agoInt)} назад"
        in 60 * 60 + 1..60 * 60 * 24 -> "${hourToString(agoInt)} назад"
        in 60 * 60 * 24 + 1..60 * 60 * 24 * 2 -> "сегодня"
        in 60 * 60 * 24 * 2 + 1..60 * 60 * 24 * 3 -> "вчера"
        else -> "давно"
    }
    return agoText
}

fun main() {
    println("Был(а) в сети ${agoToText(59)} ")
    println("Был(а) в сети ${agoToText(60)} ")
    println("Был(а) в сети ${agoToText(120)} ")
    println("Был(а) в сети ${agoToText(300)} ")
    println("Был(а) в сети ${agoToText(660)} ")
    println("Был(а) в сети ${agoToText(1260)} ")
    println("Был(а) в сети ${agoToText(1360)} ")
    println("Был(а) в сети ${agoToText(3600)} ")
    println("Был(а) в сети ${agoToText(3601)} ")
    println("Был(а) в сети ${agoToText(7200)} ")
    println("Был(а) в сети ${agoToText(18000)} ")
    println("Был(а) в сети ${agoToText(75600)} ")
    println("Был(а) в сети ${agoToText(79200)} ")
    println("Был(а) в сети ${agoToText(86400)} ")
    println("Был(а) в сети ${agoToText(86401)} ")
    println("Был(а) в сети ${agoToText(172801)} ")
    println("Был(а) в сети ${agoToText(259201)} ")
}