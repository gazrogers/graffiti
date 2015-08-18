package models

import slick.driver.H2Driver.api._
import slick.lifted.{ProvenShape, ForeignKeyQuery}

class User(tag: Tag) extends Table[(Int, String)](tag, "USER") {

  // This is the primary key column:
  def userId = column[Int]("USER_ID", O.PrimaryKey)
  def username = column[String]("USERNAME")
  
  // Every table needs a * projection with the same type as the table's type parameter
  def * = (userId, username)
}

class Graffiti(tag: Tag)
  extends Table[(Int, String, Int, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, Int, Int, Int)](tag, "graffiti") {

  def graffitiId = column[Int]("GRAFFITI_ID", O.PrimaryKey)
  def contentType = column[String]("CONTENTTYPE")
  def content = column[Int]("CONTENT")
  def latitude = column[BigDecimal]("LATITUDE")
  def longitude = column[BigDecimal]("LONGITUDE")
  def northlatitude = column[BigDecimal]("NORTHLATITUDE")
  def southlatitude = column[BigDecimal]("SOUTHLATITUDE")
  def eastlongitude = column[BigDecimal]("EASTLONGITUDE")
  def westlongitude = column[BigDecimal]("WESTLONGITUDE")
  def created = column[Int]("CREATED")
  def timetolive = column[Int]("TIMETOLIVE")
  def userId = column[Int]("USER_ID")
  
  def * = (graffitiId, contentType, content, latitude, longitude, northlatitude, southlatitude, eastlongitude, westlongitude, created, timetolive, userId)
  
  // A reified foreign key relation that can be navigated to create a join
  def user = foreignKey("USER_FK", userId, TableQuery[User])(_.userId)
}