package fundamentals.kata.restaurant

import fundamentals.kata.restaurant.DaysOfTheWeek

object RestaurantSchedule {
    @JvmStatic
    fun isRestaurantOpen(weekDay: String) {
        println("On $weekDay, the opening hours are:")
    }

    @JvmStatic
    fun getScheduleByDayWithIf(weekDay: String) {
        if (weekDay == DaysOfTheWeek.MONDAY.displayName) {
            println("8 AM to 12 PM")
        } else if (weekDay == DaysOfTheWeek.TUESDAY.displayName || weekDay == DaysOfTheWeek.WEDNESDAY.displayName || weekDay == DaysOfTheWeek.THURSDAY.displayName) {
            println("8 AM to 6 PM")
        } else if (weekDay == DaysOfTheWeek.FRIDAY.displayName) {
            println("8 AM to 9 PM")
        } else if (weekDay == DaysOfTheWeek.SATURDAY.displayName) {
            println("9 AM to 4 PM")
        } else if (weekDay == DaysOfTheWeek.SUNDAY.displayName) {
            println("8 AM to 4 PM")
        } else {
            println("Invalid day")
        }
    }

    @JvmStatic
    fun getScheduleByDayWithWhen(weekDay: String) {

        when (weekDay){
            DaysOfTheWeek.MONDAY.displayName -> println("8 AM to 12 PM")
            DaysOfTheWeek.TUESDAY.displayName,
            DaysOfTheWeek.WEDNESDAY.displayName,
            DaysOfTheWeek.THURSDAY.displayName -> println("8 AM to 6 PM")
            DaysOfTheWeek.FRIDAY.displayName -> println("8 AM to 9 PM")
            DaysOfTheWeek.SATURDAY.displayName -> println("9 AM to 4 PM")
            DaysOfTheWeek.SUNDAY.displayName -> println("8 AM to 4 PM")
            else -> println("Invalid day")
        }
    }

    @JvmStatic
    fun isLittleLemonOpen(weekDay: String, hour: Int) {
        val isOpen = when (weekDay) {
            DaysOfTheWeek.MONDAY.displayName -> hour >= 8 && hour <= 12
            DaysOfTheWeek.TUESDAY.displayName,
            DaysOfTheWeek.WEDNESDAY.displayName,
            DaysOfTheWeek.THURSDAY.displayName -> hour >= 8 && hour <= 18
            DaysOfTheWeek.FRIDAY.displayName -> hour >= 8 && hour <= 21
            DaysOfTheWeek.SATURDAY.displayName -> hour >= 9 && hour <= 16
            DaysOfTheWeek.SUNDAY.displayName -> hour >= 8 && hour <= 16
            else -> false
        }

        if (isOpen) {
            println("Little Lemon is open now")
        } else {
            println("The restaurant is closed now")
        }
    }
}