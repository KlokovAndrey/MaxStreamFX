package sample;

import algorithms.maxStream.entity.Edge;
import algorithms.maxStream.entity.Graph;
import algorithms.maxStream.entity.Node;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import static java.lang.Integer.parseInt;

public class Controller {

    @FXML
    private TextField txtA;

    @FXML
    private TextField txtB;

    @FXML
    private TextField txtC;

    @FXML
    private TextField txtD;

    @FXML
    private TextField txtE;

    @FXML
    private TextField txtF;

    @FXML
    private TextField txtG;

    @FXML
    private TextField txtH;

    @FXML
    private TextField txtI;

    @FXML
    private TextField txtJ;

    @FXML
    private TextField txtK;

    @FXML
    private TextField txtL;

    @FXML
    private TextField txtM;

    @FXML
    private TextField txtN;

    @FXML
    private TextField txtO;

    @FXML
    private Button btn;

    @FXML
    private TextField result;

    @FXML
    public void onClickMethod(){

        try {
        Edge[] edges = {new Edge(parseInt(txtA.getText())), new Edge(parseInt(txtB.getText())), new Edge(parseInt(txtB.getText())),
                new Edge(parseInt(txtD.getText())), new Edge(parseInt(txtE.getText())), new Edge(parseInt(txtF.getText())),
                new Edge(parseInt(txtG.getText())), new Edge(parseInt(txtH.getText())), new Edge(parseInt(txtI.getText())),
                        new Edge(parseInt(txtJ.getText())), new Edge(parseInt(txtK.getText())), new Edge(parseInt(txtL.getText())),
                                new Edge(parseInt(txtM.getText())), new Edge(parseInt(txtN.getText())),
                                        new Edge(parseInt(txtO.getText()))};
        Node[] nodes = {new Node(), new Node(), new Node(), new Node(), new Node(), new Node(), new Node(), new Node(),
                new Node(), new Node()};


            Graph graph = new Graph(edges, nodes);
            double sum = graph.algorithm();
            result.setText(Double.toString(sum));
        } catch (Exception ex){
            result.setText("Error");
        }
    }

}
