class Frachtflieger (name:String, geschwindigkeit:Double, laenge:Double, spannweite:Double,var ladungsGewicht: Double, typ:String, land:String)
    : Flugzeuge(name, geschwindigkeit, laenge, spannweite, typ, land) {

    override fun toString(): String {
        return this.name
    }
}