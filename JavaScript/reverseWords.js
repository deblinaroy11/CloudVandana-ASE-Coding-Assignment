                        // JavaScript Task-1
function reverseWords(sentence)
 {
    const words = sentence.split(' ');
  
    const reversedWords = words.map(word => {
      return word.split('').reverse().join('');
    });
  
    const reversedSentence = reversedWords.join(' ');
  
    return reversedSentence;
  }
  
  const inputSentence = prompt("Enter a sentence:");
  
  if (inputSentence) 
  {
    const reversedSentence = reverseWords(inputSentence);
    console.log("Reversed Sentence:", reversedSentence);
  } 
  else 
  {
    console.log("No input provided.");
  }
  
    // I am creating a reverseWords function which takes sentence as a parameter.
    // Then reverse that sentence as a result.