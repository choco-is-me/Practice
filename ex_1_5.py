import math

genders = ['W', 'M', 'M', 'W', 'M', 'M', 'W', 'M', 'M', 'W', 'M', 'W', 'M', 'W', 'M', 'M', 'M', 'W', 'M', 'M', 'M', 'W', 'W', 'W', 'M', 'M', 'W', 'M', 'M', 'W', 'M', 'M', 'W', 'W', 'M', 'M', 'W', 'M', 'M', 'M', 'W', 'W', 'W', 'W', 'M', 'M', 'W', 'M', 'M', 'M', 'W', 'W', 'W', 'M', 'M', 'M', 'W', 'W', 'W', 'M', 'M', 'M', 'W', 'W', 'M']

salaries = [27, 61, 52, 69, 88, 85, 79, 99, 77, 165, 41, 83, 144, 74, 143, 131, 34, 59, 46, 105, 61, 118, 114, 138, 24, 67, 130, 56, 99, 125, 87, 30, 119, 40, 25, 44, 123, 45, 25, 94, 86, 128, 69, 102, 91, 106, 119, 139, 67, 47, 62, 92, 124, 31, 49, 68, 109, 138, 105, 84, 86, 66, 128, 146, 59]

#1
mean = sum(salaries) / len(salaries)

deviations = [(x - mean) ** 2 for x in salaries]
variance = sum(deviations) / len(salaries)
std_dev = variance ** 0.5

#2
female_salaries = [salaries[i] for i in range(len(salaries)) if genders[i] == 'W']
females_above_mean = [s for s in female_salaries if s > mean]

proportion = len(females_above_mean) / len(female_salaries)

#3
male_salaries = [salaries[i] for i in range(len(salaries)) if genders[i] == 'M']
males_above_mean = [s for s in male_salaries if s > mean]

proportion_men = len(males_above_mean) / len(male_salaries)

print(female_salaries)
print("len W", len(female_salaries))
print(females_above_mean)
print(len(females_above_mean))
print(proportion)

print(male_salaries)
print("len M",len(male_salaries))
print(males_above_mean)
print(len(males_above_mean))
print(proportion_men)

print(mean)
print(std_dev)


#4


#5
print(math.comb(65, 30))
print(math.comb(65, 15))