from datetime import date, timedelta


"""
Iterator for all days from the start date to the end date.
"""
def daterange(start_date, end_date):
	n = end_date - start_date
	for i in range(int(n.days)):
		yield start_date + timedelta(i)


# this is kinda cheating, since we are not doing the logic for the days ourselves
# but such is life
if __name__ == "__main__":
	start = date(1900, 1, 1)
	end = date(2000, 12, 31)
	weekday = 0
	counter = 0
	for day in daterange(start, end):
		if day.year >= 1901 and day.day == 1:
			if weekday == 6:
				counter += 1
		weekday = (weekday + 1) % 7
	print(counter)