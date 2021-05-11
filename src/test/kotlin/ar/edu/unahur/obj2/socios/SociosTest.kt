package ar.edu.unahur.obj2.socios

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class SociosTest : DescribeSpec({
    describe("Propina segun"){
        describe("estados de animo") {
//        Todos son de Las Torres para no modificar el valor :)
            it("enojadx") {
                val pepe = Cliente(Enojadx, 300, LasTorres)
                pepe.cuantaPropinaDejaria(500).shouldBe(0)
            }
            it("feliz") {
                val carlos = Cliente(Feliz, 1000, LasTorres)
                carlos.cuantaPropinaDejaria(200).shouldBe(50)
            }
            it("indiferente") {
                val gonza = Cliente(Indiferente, 150, LasTorres)
                gonza.cuantaPropinaDejaria(400).shouldBe(150)
            }
            it("resfriadx") {
                val nicolas = Cliente(Resfriadx, 240, LasTorres)
                nicolas.cuantaPropinaDejaria(500).shouldBe(500)
            }
        }
        describe("barrios"){
            it("Las Rosas"){
                val pepe = Cliente(Enojadx, 300, LasRosas)
                pepe.cuantaPropinaDejaria(500).shouldBe(50)
            }
            it("Las Lauchas"){
                val carlos = Cliente(Feliz, 1000, LasLauchas)
                carlos.cuantaPropinaDejaria(200).shouldBe(25)
            }
            it("Barrio Verde"){
                val gonza = Cliente(Indiferente, 150, BarrioVerde)
                gonza.cuantaPropinaDejaria(400).shouldBe(350)
            }
            it("Las Torres"){
                val nicolas = Cliente(Resfriadx, 240, LasTorres)
                nicolas.cuantaPropinaDejaria(500).shouldBe(500)
            }
        }
    }
})