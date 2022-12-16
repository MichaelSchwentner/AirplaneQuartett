class Quartett {
    //Liste von allen Eigenschaften
    var eigenschaftenListe: MutableList<String> = mutableListOf("Geschwindigkeit", "Länge", "Spannweite")

    //Liste von Spezial Eigenschaften
    var spezialEigenschaftenListe: MutableList<String> = mutableListOf("Raketen", "Ladungsgewicht", "Sitzplätze")

    //Gewählte Eigenschaft wird hier gespeichert
    var spieler1Eigenschaftengewaehlt: String = ""

    //Punktestand wird hier gespeichert
    var spieler1Punktestand: Int = 0
    var spieler2Punktestand: Int = 0

    //Spieler1 und 2 Kartenwerte
    var spieler1Kartenwert: MutableList<Double> = mutableListOf()
    var spieler2Kartenwert: MutableList<Double> = mutableListOf()
    var kartentypSpieler1 : String = ""
    var kartentypSpieler2 : String = ""

    //Funktionen--------------------------------------------------------------------------------------------------------

    //Liste der Flugzeuge mischen
    fun mix(flugzeuge: MutableList<Flugzeuge>) {

        flugzeuge.shuffle()
    }

    //Karten werden an beide Spieler ausgegeben (For-Schleife)
    fun kartenVerteilen(spielerhand: MutableList<Flugzeuge>, deck: MutableList<Flugzeuge>) {

        spielerhand.clear()
        for (i in 1..8) {
            var ersteKarte = deck.first()
            spielerhand.add(ersteKarte)
            deck.remove(ersteKarte)
        }

        println("\uD83C\uDCA8 $spielerhand")
    }

    //Spieler2 legt eine Karte offen (Verzweigung)
    fun karteAufdecken(spielerHand2: MutableList<Flugzeuge>, flugzeuge: MutableList<Flugzeuge>) {
        //println("$gespeicherteListe")
        var karte = spielerHand2.random()
        spieler2Kartenwert.add(0, karte.geschwindigkeit)
        spieler2Kartenwert.add(1, karte.laenge)
        spieler2Kartenwert.add(2, karte.spannweite)
        when (karte) {
            is Kampfjets -> spieler2Kartenwert.add(3, karte.anzahlRaketen.toDouble())
            is Frachtflieger -> spieler2Kartenwert.add(3, karte.ladungsGewicht)
            is Passagierflieger -> spieler2Kartenwert.add(3, karte.anzahlSitzplaetze.toDouble())
        }
        kartentypSpieler2=karte.typ
        println("✈️✈️✈️✈️\uD83D\uDCCD ▶ Flugzeug: ${karte.name}")
        println("✈️✈️✈️✈️\uD83D\uDCCD ▶ Land: ${karte.land}")
        println("✈️✈️✈️✈️\uD83D\uDCCD ▶ Typ: ${karte.typ}")
        println("✈️✈️✈️✈️\uD83D\uDCCD ▶ Geschwindigkeit: ${karte.geschwindigkeit} km/h")
        println("✈️✈️✈️✈️\uD83D\uDCCD ▶ Länge: ${karte.laenge} meter")
        println("✈️✈️✈️✈️\uD83D\uDCCD ▶ Spannweite: ${karte.spannweite} meter")
        when (karte) {
            is Kampfjets -> println("✈️✈️✈️✈️\uD83D\uDCCD ▶ Raketen: ${karte.anzahlRaketen} Raketen")
            is Frachtflieger -> println("✈️✈️✈️✈️\uD83D\uDCCD ▶ Ladungsgewicht: ${karte.ladungsGewicht} Kg")
            is Passagierflieger -> println("✈️✈️✈️✈️\uD83D\uDCCD ▶ Sitzplätze: ${karte.anzahlSitzplaetze} Sitzplätze")
        }
    }

    //Spieler1 legt eine Karte offen (tryCatch, Verzweigung)
    fun karteAufdeckenIch(spielerHand1: MutableList<Flugzeuge>, flugzeuge: MutableList<Flugzeuge>){

        try {
            var meineKarte = spielerHand1[readln().toInt() - 1]

            spieler1Kartenwert.add(0, meineKarte.geschwindigkeit)
            spieler1Kartenwert.add(1, meineKarte.laenge)
            spieler1Kartenwert.add(2, meineKarte.spannweite)
            when (meineKarte) {
                is Kampfjets -> spieler1Kartenwert.add(3, meineKarte.anzahlRaketen.toDouble())
                is Frachtflieger -> spieler1Kartenwert.add(3, meineKarte.ladungsGewicht)
                is Passagierflieger -> spieler1Kartenwert.add(3, meineKarte.anzahlSitzplaetze.toDouble())
            }
            kartentypSpieler1=meineKarte.typ
            println("Du \uD83D\uDC68\u200D hast folgende Karte gewählt:")
            println("✈️✈️✈️✈️\uD83D\uDCCD ▶ Flugzeug: ${meineKarte.name}")
            println("✈️✈️✈️✈️\uD83D\uDCCD ▶ Land: ${meineKarte.land}")
            println("✈️✈️✈️✈️\uD83D\uDCCD ▶ Typ: ${meineKarte.typ}")
            println("✈️✈️✈️✈️\uD83D\uDCCD ▶ Geschwindigkeit: ${meineKarte.geschwindigkeit} km/h")
            println("✈️✈️✈️✈️\uD83D\uDCCD ▶ Länge: ${meineKarte.laenge} meter")
            println("✈️✈️✈️✈️\uD83D\uDCCD ▶ Spannweite: ${meineKarte.spannweite} meter")
            when (meineKarte) {
                is Kampfjets -> println("✈️✈️✈️✈️\uD83D\uDCCD ▶ Raketen: ${meineKarte.anzahlRaketen} Raketen")
                is Frachtflieger -> println("✈️✈️✈️✈️\uD83D\uDCCD ▶ Ladungsgewicht: ${meineKarte.ladungsGewicht} Kg")
                is Passagierflieger -> println("✈️✈️✈️✈️\uD83D\uDCCD ▶ Sitzplätze: ${meineKarte.anzahlSitzplaetze} Sitzplätze")
                else -> {
                    println("")
                }
            }

        } catch (e: Exception) {
            println("⚠️ Du darfst keine Buchstaben oder sonstige Zeichen eintippen. Bitte nur eine Zahl von 1 bis 8! ")
            karteAufdeckenIch(spielerHand1,flugzeuge)
        }
    }

    //Eigenschaft um die gespielt werden soll, wird per Zufall ausgewählt (Verzweigung)
    fun zufallEigenschaft(eigenschaftenListe: MutableList<String>){
        if (kartentypSpieler1 == kartentypSpieler2) {
            when (kartentypSpieler1){
                "Kampfjet" -> eigenschaftenListe.add(3,"Raketen")
                "Frachtflieger" -> eigenschaftenListe.add(3,"Ladungsgewicht")
                "Passagierflieger" -> eigenschaftenListe.add(3,"Sitzplätze")
            }
            }
        readln()
        spieler1Eigenschaftengewaehlt = eigenschaftenListe.random()
        //eigenschaftenListe.random().first()
        println("Ihr werdet um folgende Eigenschaft spielen:")
        println("--------> \uD83D\uDD34 ($spieler1Eigenschaftengewaehlt)")
        println("Drücke Enter um das Ergebnis zu sehen!")
        if (kartentypSpieler1 == kartentypSpieler2) {
            eigenschaftenListe.removeLast()
        }
    }

    //Ergebnis Runde (Verzweigung)
    fun ergebnisRunde() {
        when (spieler1Eigenschaftengewaehlt) {
            "Länge" -> if (spieler1Kartenwert[1] > spieler2Kartenwert[1]) {
                spieler1Punktestand += 1
                println("Du hast diese Runde gewonnen! \uD83D\uDE04")
            } else {
                spieler2Punktestand += 1
                println("Du hast diese Runde leider verloren! \uD83D\uDE22")
            }

            "Geschwindigkeit" -> if (spieler1Kartenwert[0] > spieler2Kartenwert[0]) {
                spieler1Punktestand += 1
                println("Du hast diese Runde gewonnen! \uD83D\uDE04")
            } else {
                spieler2Punktestand += 1
                println("Du hast diese Runde leider verloren! \uD83D\uDE22")
            }

            "Spannweite" -> if (spieler1Kartenwert[2] > spieler2Kartenwert[2]) {
                spieler1Punktestand += 1
                println("Du hast diese Runde gewonnen! \uD83D\uDE04")
            } else {
                spieler2Punktestand += 1
                println("Du hast diese Runde leider verloren! \uD83D\uDE22")
            }

            "Raketen" ->
                if (spieler1Kartenwert.javaClass == spieler2Kartenwert.javaClass) {
                    if (spieler1Kartenwert[3] > spieler2Kartenwert[3]) {
                        spieler1Punktestand += 1
                        println("Du hast diese Runde gewonnen! \uD83D\uDE04")
                    } else {
                        spieler2Punktestand += 1
                        println("Du hast diese Runde leider verloren! \uD83D\uDE22")
                    }
                }else( if (spieler1Kartenwert[3] > spieler2Kartenwert[3]) {
                    spieler1Punktestand += 1
                    println("Du hast diese Runde gewonnen! \uD83D\uDE04")
                } else {
                    spieler2Punktestand += 1
                    println("Du hast diese Runde leider verloren! \uD83D\uDE22")
                })

            "Ladungsgewicht" ->
                if (spieler1Kartenwert.javaClass == spieler2Kartenwert.javaClass) {
                    if (spieler1Kartenwert[3] > spieler2Kartenwert[3]) {
                        spieler1Punktestand += 1
                        println("Du hast diese Runde gewonnen! \uD83D\uDE04")
                    } else {
                        spieler2Punktestand += 1
                        println("Du hast diese Runde leider verloren! \uD83D\uDE22")
                    }
                }

            "Sitzplätze" ->
                if (spieler1Kartenwert.javaClass == spieler2Kartenwert.javaClass) {
                    if (spieler1Kartenwert[3] > spieler2Kartenwert[3]) {
                        spieler1Punktestand += 1
                        println("Du hast diese Runde gewonnen! \uD83D\uDE04")
                    } else {
                        spieler2Punktestand += 1
                        println("Du hast diese Runde leider verloren! \uD83D\uDE22")
                    }
                }
        }
        println("Dein Punktestand: $spieler1Punktestand")
        println("Punktestand der künstlichen Intelligenz: $spieler2Punktestand")
    }

    //Endergebnis (Verzweigung)
    fun endergebnis(){
        if (spieler1Punktestand>spieler2Punktestand){
            println("Herzlichen Glückwunsch, du hast dieses Spiel gewonnen! \uD83C\uDFC6")
        }else{
            println("Tut mir leid, du hast dieses Spiel leider verloren! \uD83D\uDE2D\n")
        }
    }

    //Auslagerung-------------------------------------------------------------------------------------------------------

    //Runde 1
    fun runde1(cpu:Cpu,cpuLogo :Cpu,flugzeuge: MutableList<Flugzeuge>, quartett:Quartett,flugzeugeNeueListe:MutableList<Flugzeuge>) {
        cpuLogo.vorstellungCpu()       //Logo
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
        readln()
    }

    //Runde 2
    fun runde2(flugzeuge: MutableList<Flugzeuge>, quartett:Quartett,flugzeugeNeueListe:MutableList<Flugzeuge>) {
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
    }

    //Runde 3
    fun runde3(flugzeuge: MutableList<Flugzeuge>, quartett:Quartett,flugzeugeNeueListe:MutableList<Flugzeuge>){
        flugzeuge.addAll(flugzeugeNeueListe) /// Karten werden neu aufgefüllt
        quartett.mix(flugzeuge)
        println("Letzte Runde! Jeder Spieler erhält jetzt noch einmal 8 Karten. Drücke dazu Enter.\n" + "--------------------------------------------")
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
        quartett.endergebnis()
    }

    //Spiel starten
    fun spielStarten(quartett:Quartett,cpuLogo:Cpu,cpu:Cpu,flugzeuge:MutableList<Flugzeuge>,flugzeugeNeueListe:MutableList<Flugzeuge>) {
        quartett.runde1(cpuLogo, cpu, flugzeuge, quartett, flugzeugeNeueListe)
        quartett.runde2(flugzeuge, quartett, flugzeugeNeueListe)
        quartett.runde3(flugzeuge, quartett, flugzeugeNeueListe)
    }
}