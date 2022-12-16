class Kampfjets(name:String, geschwindigkeit:Double, laenge:Double, spannweite:Double, var anzahlRaketen: Int, typ:String, land:String)
    : Flugzeuge(name, geschwindigkeit, laenge, spannweite, typ, land) {

    override fun toString(): String {
        return this.name
    }
}