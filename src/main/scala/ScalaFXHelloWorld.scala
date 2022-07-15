import scalafx.Includes._
import scalafx.application.JFXApp3
import scalafx.scene.Scene
import scalafxml.core.{FXMLView,NoDependencyResolver}

object ScalaFXHelloWorld extends JFXApp3{
  override def start(): Unit = {
    val resource = getClass.getResource("Calculator.fxml")
    val root = FXMLView(resource,NoDependencyResolver)
    stage = new JFXApp3.PrimaryStage{
      title = "Calculator"
      scene = new Scene(root)
    }
    }
}