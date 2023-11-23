# 2113110189 ยอดญาดา สุขแสงจันทร์

# 1
install.packages("magrittr")
install.packages("dplyr")
library("magrittr")
library("dplyr")

# 2
url <-
  "https://docs.google.com/spreadsheets/d/1iEcEbwAOMjX5xKuPd_EQSVEUhuFc_IKo85UdRnaq7ps/export?gid=720009007&format=csv"
peoples <- read.csv(url)
peoples
class(peoples)
dim(peoples)
head(peoples, 10)
tail(peoples, 5)
View(peoples)

# 3
str(peoples)

# 4
median(peoples$Weight)

# 5
mean(peoples$Height)

# 6
peoples %>%
  select(Gender, Weight, Height) %>%
  mutate(Bmi = round(Weight / (Height / 100) ^ 2, 2))

# 7
peoples %>%
  select(Gender, Weight, Height) %>%
  mutate(Bmi = round(Weight / (Height / 100) ^ 2, 2)) %>%
  arrange(desc(Bmi)) %>%
  head(10)

# 8
peoples %>%
  select(Gender, Weight, Height) %>%
  mutate(Bmi = round(Weight / (Height / 100) ^ 2, 2)) %>%
  filter(Gender == "F") %>%
  arrange(desc(Bmi)) %>%
  head(5)

# 9
peoples %>%
  select(Gender, Weight, Height) %>%
  mutate(Bmi = round(Weight / (Height / 100) ^ 2, 2)) %>%
  group_by(Gender) %>%
  summarise(Average_of_BMI = mean(Bmi),
            No. = n())

# 10
peoples %>%
  select(Gender, Weight, Height) %>%
  mutate(Bmi = round(Weight / (Height / 100) ^ 2, 2)) %>%
  group_by(Gender) %>%
  summarise(Average_of_BMI = mean(Bmi),
            No. = n()) %>%
  write.csv(file = "export_people_data.csv", row.names = F)