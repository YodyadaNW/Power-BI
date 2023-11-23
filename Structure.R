# structure of R
# Vector , Matrix , List , Dataframe
# Vector , Dataframe

# vector (array) --> เก็บข้อมูลที่มีชนิดเดียวกัน
# dataframe <- vector(s)

Age <- c(10, 25, 36, 14, 25, 18, 37)
Age[1]
Age[5]
Age[1] <- 33
Age


# Vector Function
length(Age)
# sum(), min(), max(), median(), mean() ,sd() <-- ส่วนเบี่ยงเบนมาตราฐาน
mean(Age)
max(Age)
sd(Age)
sort(Age) # เรียงจากน้อยไปมาก
sort(Age, decreasing = TRUE) # เรียงจากมากไปน้อย

sortAgedata <- sort(Age, decreasing = TRUE)


# Vectorization
Age
Age + 5
Next5Year <- Age + 5


# Dataframe Vector(s)
Friends <- data.frame(
  name <- c("Tom", "Ann", "Wit", "Mai", "Wee", "Su", "Tee") ,
  birthYear <- c(2530, 2556, 2545, 2584, 2564, 2547, 2541) ,
  weight <- c(60, 50, 24, 35, 62, 14, 80) ,
  height <- c(160, 150, 124, 135, 162, 114, 145) ,
  gender <- c("M", "F", NA, "F", "M", "F", "M") ,
  salary <- c(15000, NA, 60000, 52140, 8000, 74587, 25145)
)

Friends
View(Friends)
colnames(Friends)
colnames(Friends) <- c("Name", "BirthYear", "Weight", "Height", "Gender", "Salary")


# Data Exploration
str(Friends) # .info() in Python
dim(Friends) # .shape() in Python
summary(Friends) # .describe() in Python
head(Friends, 3) # .head() in Python
tail(Friends, 2) # .tail() in Python

Friends$BirthYear
Friends$BirthYear[2]

sort(Friends$BirthYear)
mean(Friends$Weight)
max(Friends$Height)

mean(Friends$Salary, na.rm = TRUE) # ถ้ามีค่า null ให้ใส่ na.rm = TRUE ถึงจะหาค่าเฉลี่ยได้


callBMI <- function(w, h) {
  bmi <- w / (h / 100) ^ 2
  return(round(bmi, 2))
}
callBMI(50,180)


# Data Preparation
# Create columns 

Friends$Bmi <- callBMI(Friends$Weight, Friends$Height)
Friends$Status <- ifelse(Friends$Bmi > 20, "Good", "Bad")
View(Friends)


# write csv
write.csv(Friends, "MyFriendsExportData.csv")
