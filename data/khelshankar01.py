import matplotlib.pyplot as plt 
x1 = [2011,2013,2015,2017] 
y1 = [13010858,14840840,15990058,17437703]  
plt.plot(x1, y1, label = "Female")  
x2 = [2011,2013,2015,2017] 
y2 = [16173473,17495394,18594723,19204675]  
plt.plot(x2, y2, label = "Male")
plt.xlabel('Year')
plt.ylabel('Data') 
plt.title('Male V/S Female') 
plt.legend() 
plt.show()
