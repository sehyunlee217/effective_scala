//enum Network:
//  case Fixed, Mobile
//
//case class Experience(duration: Int, definition: Double, network: Network)
//
//val lowQuality = 0.3 // Mb/s
//val highQuality = 0.6 // Mb/s
//
//val thirtyMin = 30 * 60 // sec
//
//val highQualityAndMobile = Experience(thirtyMin, highQuality, Network.Mobile )
//val lowQualityAndFixed = Experience(thirtyMin, lowQuality, Network.Fixed)
//
//val dataCenterEnergy = 0.000072
//val kgCO2PerKwh = 0.5
//
//def networkEnergy(network: Network): Double = network match
//  case Network.Fixed => 0.00043
//  case Network.Mobile => 0.00088
//
//
//def footprint(experience: Experience): Double =
//  val megabytes = experience.duration * experience.definition
//  val energy = dataCenterEnergy + networkEnergy(experience.network)
//  energy * megabytes * kgCO2PerKwh
//
//
//footprint(lowQualityAndFixed)
//footprint(highQualityAndMobile)
//

enum Shape:
  case Diamond, Squiggle, Oval

enum Shading:
  case Solid, Striped, Open

enum Color:
  case Red, Green, Purple

enum Number:
  case One, Two, Three

case class Card(shape: Shape, number: Number, color: Color, shading: Shading)

val deck = List(
  Card(Shape.Diamond, Number.One, Color.Purple, Shading.Striped),
  Card(Shape.Squiggle, Number.Two, Color.Red, Shading.Open),
  Card(Shape.Oval, Number.Three, Color.Green, Shading.Solid)
)

def checkShapeProp(card1: Card, card2: Card, card3: Card): Boolean =
  def allSame = card1.shape == card2.shape && card1.shape == card3.shape
  def allDifferent =
    card1.shape != card2.shape &&
    card1.shape != card3.shape &&
    card2.shape != card3.shape

  allSame || allDifferent

def checkNumProp(card1: Card, card2: Card, card3: Card): Boolean =
  def allSame = card1.number == card2.number && card1.number == card3.number
  def allDifferent =
    card1.number != card2.number &&
      card1.number != card3.number &&
      card2.number != card3.number

  allSame || allDifferent

def checkColorProp(card1: Card, card2: Card, card3: Card): Boolean =
  def allSame = card1.color == card2.color && card1.color == card3.color
  def allDifferent =
    card1.color != card2.color &&
      card1.color != card3.color &&
      card2.color != card3.color

  allSame || allDifferent

def checkShadingProp(card1: Card, card2: Card, card3: Card): Boolean =
  def allSame = card1.shading == card2.shading && card1.shading == card3.shading
  def allDifferent =
    card1.shading != card2.shading &&
      card1.shading != card3.shading &&
      card2.shading != card3.shading

  allSame || allDifferent

def isValidSet(card1: Card, card2: Card, card3: Card): Boolean =
  checkShapeProp(card1, card2, card3) &&
  checkNumProp(card1, card2, card3) &&
  checkColorProp(card1, card2, card3) &&
  checkShadingProp(card1, card2, card3)

isValidSet(  Card(Shape.Diamond, Number.One, Color.Purple, Shading.Striped),
  Card(Shape.Squiggle, Number.Two, Color.Red, Shading.Open),
  Card(Shape.Oval, Number.Three, Color.Green, Shading.Solid))