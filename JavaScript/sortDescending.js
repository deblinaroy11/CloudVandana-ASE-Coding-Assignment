      // JavaScript Task-2
    function SortDescending(arr)
     {
      var n = arr.length;
    
      for (var i = 0; i < n - 1; i++) {
        var maxIndex = i;
  
        for (var j = i + 1; j < n; j++)
         {
          if (arr[j] > arr[maxIndex])
           {
            maxIndex = j;
          }
        }

        
        var temp = arr[i];
        arr[i] = arr[maxIndex];
        arr[maxIndex] = temp;
      }
    
      return arr;
    }
    

    var input = prompt("Enter numbers separated by commas for Creating an Array: ");
    var inputArray = input.split(',').map(Number);
    
    var sortedArray = SortDescending(inputArray);
  
    console.log("Sorted Array in Descending Order:", sortedArray);


    // I am creating a sortDescending function which takes an array as a parameter.
    // Then sort this array in descending order.
  
    