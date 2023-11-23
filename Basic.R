# Basic R

4 + 5 - 7 / 4

# print()
print("Yodyada Sooksangjun")
print('Yodyada Sooksangjun')

Name <- 'Yodyada'  # กำหนดค่าตัวแปร
Name <- 20L # L integer , numeric
Name <- 150
Name <- TRUE # logical TRUE T , FALSE F

print(Name)
paste("Your name is", Name) # เชื่อมข้อความ
Name
rm(Name) #rm remove

class(Name)


#readline() , convert type character -> numeric
# รับค่าเป็น string หมด
BirthYear <- readline("Please enter your birth year :")
Age <- 2566 - as.numeric(BirthYear)
paste("Your Birth Year is", BirthYear)
paste("Your age is", Age)
ifelse(Age >= 18, "You can vote", "You can not vote")

# if(Age >= 18){
#   print("You can Vote")
# }else{
#   print("You can not Vote")
# }


5 / 2
5 %% 2
5 %/% 2 # หารเอาจำนวนเต็ม


# cal BMI input weight(kg) , height(cm.)
Weight <- readline("Input ypur weight(kg.) :")
Height <- readline("Input your height(cm.) :")
Weight <- as.numeric(Weight)
Height <- as.numeric(Height)
BMI <- Weight / (Height / 100) ^ 2
paste("Your BMI is", round(BMI, 2))
if (BMI > 40) {
  Catecory <- "Obese Class III"
} else if (BMI >= 35) {
  Catecory <- "Obese Class II"
} else if (BMI >= 30) {
  Catecory <- "Obese Class I"
} else if (BMI >= 25) {
  Catecory <- "Overweight"
} else if (BMI >= 18.5) {
  Catecory <- "Normal"
} else if (BMI >= 17) {
  Catecory <- "Mild Thinness"
} else if (BMI >= 16) {
  Catecory <- "Moderate Thinness"
} else{
  Catecory <- "Severe Thinness"
}
paste("Your category is", Catecory)


# Function
callBMI <- function(W, H) {
  BMI <- W / (H / 100) ^ 2
  return(round(BMI, 2))
}
rm(callBMI)
callBMI(50, 165)

#convert Baht to US
#input Baht
#output USD(dollar)
convert.Baht.to.dollar <- function(baht) {
  dollar <- baht * 0.031
  return(dollar)
}
convert.Baht.to.dollar(10000)


#Vector (List)
salary_range <- 10000:40000
#สุ่มเงินเดือนของคน 100 คน
salarys <- sample(salary_range, 100)
salarys #Vector
#R index start by 1
salarys[1]

salary.usd <- convert.Baht.to.dollar(salarys)
salary.usd

#satisfied(salary.usd)
#usd 1000 Good , <1000 Bad
satisfied <- function(USD) {
  result <- ifelse(USD >= 1000, "Good", "Bad")
  return(result)
}
satisfied(salary.usd)
