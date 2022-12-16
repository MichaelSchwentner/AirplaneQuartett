//Runde1--------------------------------------------------------------------------------------------------------------------------------------------------
/*    cpuLogo.vorstellungCpu()       //Logo
    readln()                       //readline
    cpu.vorstellungEser()          //Begrüßung Eser
    quartett.mix(flugzeuge)        //Karten werden gemischt (shuffle)
    println("Jeder Spieler erhält jetzt 8️⃣ Karten\n" + "--------------------------------------------")
    println("∎∎∎∎∎ Die künstliche Intelligenz Eser \uD83E\uDD16 hat nun folgende Karten:")
    quartett.kartenVerteilen(spielerHand2, flugzeuge)         //Karten werden an beide Spieler ausgegeben
    println("∎∎∎∎∎ Du \uD83D\uDC68\u200D hast nun folgende Karten:")
    quartett.kartenVerteilen(spielerHand1, flugzeuge)         //Karten werden an beide Spieler ausgegeben
    println("--------------------------------------------")
    println("Die künstliche Intelligenz Eser \uD83E\uDD16 wählt folgende Karte aus seinem Deck:")
    quartett.karteAufdecken(spielerHand2, flugzeuge)          //Spieler2 legt eine Karte offen
    println("--------------------------------------------")
    println("Bitte wähle jetzt auch eine Karte aus deinem Deck! Nutze dazu Zahlen von 1 bis 8.")
    quartett.karteAufdeckenIch(spielerHand1, flugzeuge)       //Spieler2 legt eine Karte offen
    println("--------------------------------------------")
    println("Bitte drücke Enter, um eine zufällige \uD83C\uDFB2 Eigenschaft zu wählen, um die ihr spielen werdet.\n" + "--------------------------------------------")
    quartett.zufallEigenschaft(quartett.eigenschaftenListe)   //Per Zufall wird eine Eigenschaft gewählt
    println("--------------------------------------------")
    readln()
    quartett.ergebnisRunde()   //Runde wird ausgewertet
    println("Drücke Enter um die nächste Runde zu starten!")
    println("--------------------------------------------")
    readln()*/

/*    //Runde2-----------------------------------------------------------------------------------------------------------
    flugzeuge.addAll(flugzeugeNeueListe) /// Karten werden neu aufgefüllt
    quartett.mix(flugzeuge)
    println("Runde 2: Jeder Spieler erhält jetzt wieder 8 Karten\n" + "--------------------------------------------")
    println("∎∎∎∎∎ Die künstliche Intelligenz Eser \uD83E\uDD16 hat nun folgende Karten:")
    quartett.kartenVerteilen(spielerHand2, flugzeuge)         //Karten werden an beide Spieler ausgegeben
    println("∎∎∎∎∎ Du \uD83D\uDC68\u200D hast nun folgende Karten:")
    quartett.kartenVerteilen(spielerHand1, flugzeuge)         //Karten werden an beide Spieler ausgegeben
    println("--------------------------------------------")
    println("Die künstliche Intelligenz Eser \uD83E\uDD16 wählt folgende Karte aus seinem Deck:")
    quartett.karteAufdecken(spielerHand2, flugzeuge)          //Spieler2 legt eine Karte offen
    println("--------------------------------------------")
    println("Bitte wähle jetzt auch eine Karte aus deinem Deck! Nutze dazu Zahlen von 1 bis 8.")
    quartett.karteAufdeckenIch(spielerHand1, flugzeuge)       //Spieler2 legt eine Karte offen
    println("--------------------------------------------")
    println("Bitte drücke Enter, um eine zufällige \uD83C\uDFB2 Eigenschaft zu wählen, um die ihr spielen werdet.\n" + "--------------------------------------------")
    quartett.zufallEigenschaft(quartett.eigenschaftenListe)   //Per Zufall wird eine Eigenschaft gewählt
    println("--------------------------------------------")
    readln()
    quartett.ergebnisRunde()

//Runde3-----------------------------------------------------------------------------------------------------------
    flugzeuge.addAll(flugzeugeNeueListe) /// Karten werden neu aufgefüllt
    quartett.mix(flugzeuge)
    println("Letzte Runde! Jeder Spieler erhält jetzt noch einmal 8 Karten. Drücke dazu Enter\n" + "--------------------------------------------")
    readln()
    println("∎∎∎∎∎ Die künstliche Intelligenz Eser \uD83E\uDD16 hat nun folgende Karten:")
    quartett.kartenVerteilen(spielerHand2, flugzeuge)         //Karten werden an beide Spieler ausgegeben
    println("∎∎∎∎∎ Du hast nun folgende Karten:")
    quartett.kartenVerteilen(spielerHand1, flugzeuge)         //Karten werden an beide Spieler ausgegeben
    println("--------------------------------------------")
    println("Die künstliche Intelligenz Eser \uD83E\uDD16 wählt folgende Karte aus seinem Deck:")
    quartett.karteAufdecken(spielerHand2, flugzeuge)          //Spieler2 legt eine Karte offen
    println("--------------------------------------------")
    println("Bitte wähle jetzt auch eine Karte aus deinem Deck! Nutze dazu Zahlen von 1 bis 8.")
    quartett.karteAufdeckenIch(spielerHand1, flugzeuge)       //Spieler2 legt eine Karte offen
    println("--------------------------------------------")
    println("Bitte drücke Enter, um eine zufällige \uD83C\uDFB2 Eigenschaft zu wählen, um die ihr spielen werdet.\n" + "--------------------------------------------")
    quartett.zufallEigenschaft(quartett.eigenschaftenListe)   //Per Zufall wird eine Eigenschaft gewählt
    println("--------------------------------------------")
    readln()
    quartett.ergebnisRunde()
    println("Du hast jetzt 3 Runden gespielt. Drücke Enter um zu sehen wer dieses Spiel gewonnen hat.")
    println("--------------------------------------------")
    readln()
    quartett.endergebnis()*/


/* quartett.runde1(cpuLogo,cpu,flugzeuge,quartett,flugzeugeNeueListe)
 quartett.runde2(flugzeuge,quartett,flugzeugeNeueListe)
 quartett.runde3(flugzeuge,quartett,flugzeugeNeueListe)*/


/*
//Endergebnis
fun endergebnis(){
    */
/*        var willWeiterSpielen = false
            var eingabe = ""
            var richtigeEingabe = false*//*

    if (spieler1Punktestand>spieler2Punktestand){
        println("Herzlichen Glückwunsch, du hast dieses Spiel gewonnen! \uD83C\uDFC6")
        //println("Möchtest du noch einmal spielen? Antworte mit JA oder NEIN")
    }else{
        println("Tut mir leid, du hast dieses Spiel leider verloren! \uD83D\uDE2D\n")
        //println("Möchtest du noch einmal spielen? Antworte mit JA oder NEIN")
    }
    */
/*        do {
                eingabe=readln().uppercase()
                if (eingabe=="JA"){
                    willWeiterSpielen=true
                    richtigeEingabe= true

                }else if (eingabe=="NEIN"){

                    willWeiterSpielen=false
                    richtigeEingabe = true
                }else{
                    println("Ungültige Eingabe.")
                }
            }while (richtigeEingabe==false)
            return willWeiterSpielen*//*


}*/


//Liste von allen Eigenschaften
/*    var eigenschaftenListe : MutableList<String> = mutableListOf("Name","Geschwindigkeit", "Länge", "Spannweite")
    var spieler1Eigenschaftengewaehlt : MutableList<Flugzeuge> = mutableListOf()*/

//Test