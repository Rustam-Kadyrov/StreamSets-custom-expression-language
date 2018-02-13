# StreamSets custom EL example

1. Build library:

    `gradle clean build`
 
1. Put output jar file into SDC_HOME/libs-common-lib folder
1. Restart StreamSets
1. Use custom expression function:

    `${extraString:reverseOrder('hello!')}`
    
   or use it like that, if you want to take value from previous step 
    
    `${extraString:reverseOrder(record:value('/inputField'))}`