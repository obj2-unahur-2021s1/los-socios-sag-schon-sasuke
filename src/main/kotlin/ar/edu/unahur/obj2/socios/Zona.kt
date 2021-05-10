package ar.edu.unahur.obj2.socios

abstract class Zona(){
    abstract fun influirPropina(cliente: Cliente):Int
}


class  Las_Lauchas() : Zona(){
    override fun influirPropina(cliente: Cliente) = -(cliente.propina / 2)

}

class Las_Rosas() : Zona(){
    override fun influirPropina(cliente: Cliente) = 50
}

class Barrio_Verde() : Zona(){
    override fun influirPropina(cliente: Cliente) = 200
}

class Las_Torres() : Zona() {
    override fun influirPropina(cliente: Cliente) = 0
}