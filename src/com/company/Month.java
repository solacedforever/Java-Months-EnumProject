package com.company;

public enum Month {
  JANUARY("January"),FEBRUARY("February"),MARCH("March"),APRIL("April"), MAY("May"), JUNE("June"), JULY("July"), AUGUST("Agust"), SEPTEMBER("September"), OCTOBER("October"), NOVEMBER("November"), DECEMBER("December");

  private String englishName;

  Month(String englishName) {
    this.englishName = englishName;
  }

  public String getEnglishName() {
    return englishName;
  }

  public int days(int year){

    int numDays = 0;

    switch (this) {
      case JANUARY:
        numDays = 31;
        break;
      case FEBRUARY:
        if (((year % 4 == 0) &&
                !(year % 100 == 0))
                || (year % 400 == 0)) {
          numDays = 29;
        }
        else {
          numDays = 28;
        }
        break;
      case MARCH:
        numDays = 31;
        break;
      case APRIL:
        numDays = 30;
        break;
      case MAY:
        numDays = 31;
        break;
      case JUNE:
        numDays = 30;
        break;
      case JULY:
        numDays = 31;
        break;
      case AUGUST:
        numDays = 31;
        break;
      case SEPTEMBER:
        numDays = 30;
        break;
      case OCTOBER:
        numDays = 31;
        break;
      case NOVEMBER:
        numDays = 30;
        break;
      case DECEMBER:
        numDays = 31;
        break;
    }
  return numDays;
  }
}
