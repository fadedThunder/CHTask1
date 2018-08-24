Description
=======================

1) The function 'getAverageCostForProcedure(String procedureCosts, String procedureCode)' calculates the average cost of the a procedureCode.

2) The method takes in 2 parameters, 'procedureCosts' & 'procedureCode'.

3) If 'procedureCode' is not available in the String 'procedureCosts' then the method returns 0.0.
   else the String 'procedureCosts'is split by '||' and all the elements of the String[] that contains 'procedureCode' will get added into    a float variable 'averageTotal' only after replacing non numeric values with "". A counter is maintained and the division of    'averageTotal' / 'counter' is returned.
