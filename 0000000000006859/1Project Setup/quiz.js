const questionObj =
{
  category: 'Food & Drink',
  id: 'qa-1',
  correctAnswer: 'Three',
  options: ['Two', 'Three ', 'Four', 'Five'],
  question:
    "How many pieces of bun are in a Mcdonald's Big Mac?",
};
const { correctAnswer, options, question } = questionObj;
let score = 0;
const questionEle = document.getElementById("question");
const optionEl = document.getElementById("options");
const scoreEl = document.getElementById("score");
questionEle.textContent = question;

options.forEach((opt) => {
  const btn = document.createElement('button');
  btn.textContent = opt;
  optionEl.appendChild(btn);

  //event handaling 
  btn.addEventListener('click', () => {
    if (opt == correctAnswer) {
      score++;
    }
    else {
      score = score - 0.25;
    }
    console.log(score);
  });
});