// Funcion de Simpson
def integracion(f: Double => Double, a: Double, b: Double): Double = {
  val x = (a + b) / 2
  (b - a) * (f(a) + 4 * f(x) + f(b)) / 6
}

// Funcion para calcular el error en cada aproximacion
def error(esperado: Double, obtenido: Double): Double = {
  math.abs(esperado - obtenido)
}

// Integrales, resultado y error en cada aproximacion
val f1 = (x: Double) => - math.pow(x, 2) + 8 * x - 12
val resultado1 = integracion(f1, 3.0, 5.0)
val error1 = error(7.33, resultado1)


val f2 = (x: Double) => 3 * math.pow(x, 2)
val resultado2 = integracion(f2, 0.0, 2.0)
val error2 = error(8, resultado2)


val f3 = (x: Double) => x + 2 * math.pow(x, 2) - math.pow(x, 3) + 5 * math.pow(x, 4)
val resultado3 = integracion(f3, -1.0, 1.0)
val error3 = error(3.333, resultado3)


val f4 = (x: Double) => (2 * x + 1) / (math.pow(x, 2) + x)
val resultado4 = integracion(f4, 1.0, 2.0)
val error4 = error(1.08861, resultado4)


val f5 = (x: Double) => math.exp(x)
val resultado5 = integracion(f5, 0.0, 1.0)
val error5 = error(1.71828, resultado5)


val f6 = (x: Double) => 1.0 / (math.sqrt(x - 1))
val resultado6 = integracion(f6, 2.0, 3.0)
val error6 = error(0.828427, resultado6)


val f7 = (x: Double) => 1.0 / (1 + math.pow(x, 2))
val resultado7 = integracion(f7, 0.0, 1.0)
val error7 = error(0.785398, resultado7)

