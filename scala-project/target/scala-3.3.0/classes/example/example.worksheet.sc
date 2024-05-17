import javax.swing.Action
//def house(facade: Double, window: Double): Double =
//  facade - window*2
//
//def time(speed: Double): Double =
//  val distance = 42.195
//  val duration = distance / speed
//  duration * 60
//
//time(speed = 12)
//
//time(speed = 14)
//case class Rectangle(width: Int, height: Int):
//  val area = width*height
//
//case class Square(side: Int):
//  val area = side * side
//
//case class Circle(radius: Int):
//  val area = radius * radius * Math.PI
//
//val facade = Rectangle(5, 3)
//val plate = Square(4)
//val moon = Circle(10)
//
//val new_facade = facade.copy(width = facade.width * 2)
//
//new_facade.area
//
//facade.area
//plate.area
//moon.area

//sealed trait Action
//case class Subscribe(channel: Channel) extends Action
//case class Unsubscribe(channel: Channel) extends Action
//case class PostMessage(channel: Channel, message: String) extends Action
//
//case class Channel(name: String)


enum PrimaryColor:
  case Red, Blue, Green


PrimaryColor.valueOf("Red")