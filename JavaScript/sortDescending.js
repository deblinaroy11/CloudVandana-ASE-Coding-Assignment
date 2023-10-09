                        // JavaScript Task-2
function sortDescending(arr)
 {
    arr.sort((a, b) => b - a);
    return arr;
  }
  
  const inputString = prompt("Enter numbers separated by commas for Creating an Array:");
  
  if (inputString)
   {
    const inputArray = inputString.split(',').map(Number);
  
    if (!inputArray.some(isNaN))
     {
      console.log("Input Array:", inputArray);
  
      const sortedArray = sortDescending(inputArray);
      console.log("Sorted Descending Array:", sortedArray);
    } 
    else
     {
      console.log("Invalid input. Please enter valid numbers separated by commas.");
    }
  } 
  else 
  {
    console.log("No input provided.");
  }

     // I am creating a sortDescending function which takes an array as a parameter.
    // Then sort this array in descending order.
  