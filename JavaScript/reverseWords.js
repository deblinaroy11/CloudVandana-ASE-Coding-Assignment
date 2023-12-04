// JavaScript Task-1

    function reverseWords(sentence)
   {
         var words = sentence.split(' ');
        for (var i = 0; i < words.length; i++)
         {
              words[i] = reverseString(words[i]);
        }    
      var reversedSentence = words.join(' ');
      console.log(reversedSentence);
   }
                      
      function reverseString(str)
       {

          var reversed = '';
          for (var i = str.length - 1; i >= 0; i--)
           {
              reversed += str[i];
          }
              return reversed;
        }
                      
  
  const inputSentence = prompt("Enter a sentence:");
  reverseWords(inputSentence);  
  
    // I am creating a reverseWords function which takes sentence as a parameter.
    // Then reverse that sentence by using reverseString function.