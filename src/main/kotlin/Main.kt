
//Spielerhände
var spielerHand1 : MutableList<Flugzeuge> = mutableListOf()
var spielerHand2 : MutableList<Flugzeuge> = mutableListOf()

//Kartendeck--------------------------------------------------------------------------------------------------------------------------------------------------
//Kampfjets
var tornadoIDS : Kampfjets = Kampfjets("✈︎︎Tornado IDS",2338.0,17.00,13.91,8,"Kampfjet","\uD83C\uDDFA\uD83C\uDDF8 USA")
var f15JEagle : Kampfjets = Kampfjets("✈︎︎F-15DJ Eagle",3087.0,19.00,18.00,4,"Kampfjet","\uD83C\uDDFA\uD83C\uDDF8 USA")
var su30 : Kampfjets =  Kampfjets("✈︎︎Su30",2120.0,22.00,14.70,16,"Kampfjet","\uD83C\uDDF7\uD83C\uDDFA Russia")
var lockheedF104Starfighter : Kampfjets =  Kampfjets("✈︎︎Lockheed F-104 Starfighter",2450.0,16.69,6.68,6,"Kampfjet","\uD83C\uDDFA\uD83C\uDDF8 USA")
var chengduJ7 : Kampfjets =  Kampfjets("✈︎︎Chengdu J-7",2175.0,14.98,7.15,12,"Kampfjet","\uD83C\uDDE8\uD83C\uDDF3 China")
var miG29FulcrumA : Kampfjets =  Kampfjets("✈︎︎MiG-29 Fulcrum-A",2390.0,17.32,11.36,10,"Kampfjet","\uD83C\uDDF7\uD83C\uDDFA Russia")

//Frachtflugzeuge
var boeing757 : Frachtflieger = Frachtflieger("✈︎Boeing 757",982.0,21.00,17.00,27210.0,"Frachtflieger","\uD83C\uDDFA\uD83C\uDDF8 USA")
var mcDonnellDouglasMD11 : Frachtflieger = Frachtflieger("✈︎McDonnell Douglas MD-11",945.0,61.00,52.00,28000.0,"Frachtflieger","\uD83C\uDDFA\uD83C\uDDF8 USA")
var a330200F : Frachtflieger = Frachtflieger("✈︎A330-200F",871.0,59.00,60.30,65000.0,"Frachtflieger","\uD83C\uDDEB\uD83C\uDDF7 Frankreich")
var il96400T : Frachtflieger = Frachtflieger("✈︎Il-96-400T",900.0,55.30,60.10,88000.0,"Frachtflieger","\uD83C\uDDF7\uD83C\uDDFA Russia")
var aleniaC27JSpartan : Frachtflieger = Frachtflieger("✈︎Alenia C-27J Spartan",602.0,22.70,28.70,10000.0,"Frachtflieger","\uD83C\uDDEE\uD83C\uDDF9 Italien")

//Passagierflugzeuge
var airbusA350900 : Passagierflieger = Passagierflieger("✈︎Airbus A350-900",871.0,66.98,65.00,324,"Passagierflieger","\uD83C\uDDEA\uD83C\uDDFA EU")
var embraerE170 : Passagierflieger = Passagierflieger("✈︎Embraer E-170",871.0,21.00,17.00,80,"Passagierflieger","\uD83C\uDDE7\uD83C\uDDF7 Brasilien")
var airbusa321 : Passagierflieger = Passagierflieger("✈︎Airbus a321",876.0,45.00,34.00,212,"Passagierflieger","\uD83C\uDDEA\uD83C\uDDFA EU")
var boeing7478 : Passagierflieger = Passagierflieger("✈︎Boeing 747-8",988.0,76.00,68.00,364,"Passagierflieger","\uD83C\uDDFA\uD83C\uDDF8 USA")
var airbusA340600 : Passagierflieger = Passagierflieger("✈︎Airbus A340-600",913.0,75.00,63.00,297,"Passagierflieger","\uD83C\uDDEA\uD83C\uDDFA EU")

//---------------------------------------------------------------------------------------------------------------------------------------------------

fun main() {
    //Liste aller Flugzeuge (Stappel Karten)
    var flugzeuge : MutableList<Flugzeuge> = mutableListOf(tornadoIDS,f15JEagle,su30,boeing757,mcDonnellDouglasMD11,a330200F,
        airbusA350900,embraerE170,airbusa321,il96400T,aleniaC27JSpartan, lockheedF104Starfighter,chengduJ7,boeing7478,airbusA340600,miG29FulcrumA)
    //Neue Liste aller Flugzeuge (Stappel Karten)
    var flugzeugeNeueListe : MutableList<Flugzeuge> = mutableListOf(tornadoIDS,f15JEagle,su30,boeing757,mcDonnellDouglasMD11,a330200F,
        airbusA350900,embraerE170,airbusa321,il96400T,aleniaC27JSpartan, lockheedF104Starfighter,chengduJ7,boeing7478,airbusA340600,miG29FulcrumA)

    // Quartett
    var quartett : Quartett = Quartett()

    //Cpu Logo & Gegner
    var cpuLogo : Cpu = Cpu("Logo")
    var cpu : Cpu = Cpu("Eser")

    //Spiel starten
    quartett.spielStarten(quartett,cpu,cpuLogo,flugzeuge,flugzeugeNeueListe)
}