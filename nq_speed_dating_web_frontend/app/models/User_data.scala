package models

import database.Database_ID

case class User(database_ID: Database_ID)

// Querying and updating data about users' expertises.
object User_expertise_data {
  // Sets the expertise level of `user` in `expertise` to `expertise_level` in the database.
  def set_expertise_level(user: User, expertise: Expertise, expertise_level: Expertise_Level.Expertise_Level): Unit = {
    // TODO: Update database
  }

  def get_expertise_level(user: User, expertise: Expertise): Expertise_Level.Expertise_Level = Expertise_Level.no_interest // TODO
}