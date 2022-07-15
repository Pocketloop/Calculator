
import scalafx.event.ActionEvent
import scalafxml.core.macros.sfxml
import scalafx.scene.control.TextField
import scalafx.scene.text.Text
import javafx.{scene => jfxs}

@sfxml
class MainController {
  private val textField = TextField
  private val savedNumbers = Text
  private var firstNumber = ""
  private var currentNumber = ""
  private var calculationType = null

  def addAction(event: ActionEvent): Unit = {
    calculationSetup("+")
  }

  def minusAction(event: ActionEvent): Unit = {
    calculationSetup("-")
  }

  def divideAction(event: ActionEvent): Unit = {
    calculationSetup("/")
  }

  def multiplicationAction(event: ActionEvent): Unit = {
    calculationSetup("*")
  }

  def calculationSetup(calculationType: String): Unit = {
    this.calculationType = calculationType
    firstNumber = currentNumber
    currentNumber = ""
    savedNumbers.setText(firstNumber + " " + calculationType)
  }

  def calculate(event: ActionEvent): Unit = {
    val firstNumberInt = firstNumber.toInt
    val secondNumberInt = currentNumber.toInt
    calculationType match {
      case "+" => val calculatedNumber = firstNumberInt + secondNumberInt
        savedNumbers.setText(firstNumber + " + " + currentNumber + " = " + calculatedNumber)
        textField.setText(String.valueOf(calculatedNumber))

      case "-" => val calculatedNumber = firstNumberInt - secondNumberInt
        savedNumbers.setText(firstNumber + " - " + currentNumber + " = " + calculatedNumber)
        textField.setText(String.valueOf(calculatedNumber))

      case "/" => val calculatedNumber = firstNumberInt / secondNumberInt.toDouble
        savedNumbers.setText(firstNumber + " / " + currentNumber + " = " + calculatedNumber)
        textField.setText(String.valueOf(calculatedNumber))

      case "*" => val calculatedNumber = firstNumberInt * secondNumberInt
        savedNumbers.setText(firstNumber + " * " + currentNumber + " = " + calculatedNumber)
        textField.setText(String.valueOf(calculatedNumber))

    }
  }

  def clearTextField(event: ActionEvent): Unit = {
    currentNumber = ""
    textField.setText("")
    savedNumbers.setText("")
  }

  def button0(event: ActionEvent): Unit = {
    if (!(currentNumber == "")) addNumber("0")
  }

  def button1(event: ActionEvent): Unit = {
    addNumber("1")
  }

  def button2(event: ActionEvent): Unit = {
    addNumber("2")
  }

  def button3(event: ActionEvent): Unit = {
    addNumber("3")
  }

  def button4(event: ActionEvent): Unit = {
    addNumber("4")
  }

  def button5(event: ActionEvent): Unit = {
    addNumber("5")
  }

  def button6(event: ActionEvent): Unit = {
    addNumber("6")
  }

  def button7(event: ActionEvent): Unit = {
    addNumber("7")
  }

  def button8(event: ActionEvent): Unit = {
    addNumber("8")
  }

  def button9(event: ActionEvent): Unit = {
    addNumber("9")
  }

  def updateTextField(): Unit = {
    textField.setText(currentNumber)
  }

  def addNumber(number: String): Unit = {
    currentNumber += number
    updateTextField()
  }
}