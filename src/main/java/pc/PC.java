package pc;

import main.out.pl.edu.agh.talaga.PairwiseComparisons;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/**
 * Created by dawid on 26.11.16.
 */
@RestController
@EnableAutoConfiguration
public class PC {

    PairwiseComparisons pc;

    @RequestMapping(value="/function", method = RequestMethod.POST)
    public Response update(@RequestBody Function fun){
    //    public ResponseEntity<Function> update(@RequestBody Function fun){
        pc = new PairwiseComparisons();

        Response response = new Response();

        response.setType("matrix");
        response.setType("vector");
        response.setType("double");
        response.setType("int");

        String name = fun.name;
        System.out.println(name);
       // Object response.values = null;

        try {

            switch (name) {
                case "principalEigenValue":
                    response.values = pc.principalEigenValue(fun.matrix);
                    response.setType("double");
                    break;
                case "principalEigenValueSym":
                    response.values = pc.principalEigenValueSym(fun.matrix);
                    response.setType("double");
                    break;
                case "principalEigenVector":
                    response.values = pc.principalEigenVector(fun.matrix);
                    response.setType("vector");
                    break;
                case "principalEigenVectorSym":
                    response.values = pc.principalEigenVectorSym(fun.matrix);
                    response.setType("vector");
                    break;
                case "saatyIdx":
                    response.values = pc.saatyIdx(fun.matrix);
                    response.setType("double");

                    break;
                case "saatyIdxSym":
                    response.values = pc.saatyIdxSym(fun.matrix);
                    response.setType("double");

                    break;
                case "eigenValueRank":
                    response.values = pc.eigenValueRank(fun.matrix);
                    response.setType("vector");

                    break;
                case "eigenValueRankSym":
                    response.values = pc.eigenValueRankSym(fun.matrix);
                    response.setType("vector");

                    break;
                case "ahp":
                    response.values = pc.ahp(fun.matrix);
                    response.setType("vector");
                    System.out.println(Arrays.toString((double[]) response.values));
                    break;
                case "geometricRank":
                    response.values = pc.geometricRank(fun.matrix);
                    response.setType("vector");

                    break;
                case "geometricRescaledRank":
                    response.values = pc.geometricRescaledRank(fun.matrix);
                    response.setType("vector");

                    break;
                case "getMatrixEntry":
                    response.values = pc.getMatrixEntry(fun.matrix, fun.row, fun.column);
                    response.setType("double");

                    break;
                case "recreatePCMatrix":
                    response.values = pc.recreatePCMatrix(fun.matrix);
                    response.setType("matrix");
                    break;
                case "deleteRows":
                    response.values = pc.deleteRows(fun.matrix, fun.list);
                    response.setType("matrix");
                    break;
                case "deleteColumns":
                    response.values = pc.deleteColumns(fun.matrix, fun.list);
                    response.setType("matrix");
                    break;
                case "deleteRowsAndColumns":
                    response.values = pc.deleteRowsAndColumns(fun.matrix, fun.list);
                    response.setType("matrix");
                    break;
                case "setDiagonal":
                    response.values = pc.setDiagonal(fun.matrix, fun.valueToSet);
                    response.setType("matrix");
                    break;
                case "HREmatrix":
                    response.values = pc.HREmatrix(fun.matrix, fun.vector);
                    response.setType("matrix");
                    break;
                case "HREconstantTermVector":
                    response.values = pc.HREconstantTermVector(fun.matrix, fun.vector);
                    response.setType("vector");
                    break;
                case "HREpartialRank":
                    response.values = pc.HREpartialRank(fun.matrix, fun.vector);
                    response.setType("vector");
                    break;
                case "HREfullRank":
                    response.values = pc.HREfullRank(fun.matrix, fun.vector);
                    response.setType("vector");
                    break;
                case "HRErescaledRank":
                    response.values = pc.HRErescaledRank(fun.matrix, fun.vector);
                    response.setType("vector");
                    break;
                case "HREgeomMatrix":
                    response.values = pc.HREgeomMatrix(fun.matrix, fun.vector);
                    response.setType("matrix");
                    break;
                case "HREgeomConstantTermVector":
                    response.values = pc.HREgeomConstantTermVector(fun.matrix, fun.vector);
                    response.setType("vector");
                    break;
                case "HREgeomIntermediateRank":
                    response.values = pc.HREgeomIntermediateRank(fun.matrix, fun.vector);
                    response.setType("vector");
                    break;
                case "HREgeomPartialRank":
                    response.values = pc.HREgeomPartialRank(fun.matrix, fun.vector);
                    response.setType("vector");
                    break;
                case "HREgeomFullRank":
                    response.values = pc.HREgeomFullRank(fun.matrix, fun.vector);
                    response.setType("vector");
                    break;
                case "HREgeomRescaledRank":
                    response.values = pc.HREgeomRescaledRank(fun.matrix, fun.vector);
                    response.setType("vector");
                    break;
                case "koczkodajTriadIdx":
                    response.values = pc.koczkodajTriadIdx(fun.triad);
                    response.setType("double");

                    break;
                case "koczkodajTheWorstTriad":
                    response.values = pc.koczkodajTheWorstTriad(fun.matrix);
                    response.setType("vector");

                    break;
                case "koczkodajTheWorstTriads":
                    response.values = pc.koczkodajTheWorstTriads(fun.matrix, fun.numberOfTriads);
                    response.setType("matrix");
                    break;
                case "koczkodajIdx":
                    response.values = pc.koczkodajIdx(fun.matrix);
                    response.setType("double");

                    break;
                case "koczkodajConsistentTriad":
                    response.values = pc.koczkodajConsistentTriad(fun.triad);
                    response.setType("vector");
                    break;
                case "koczkodajImprovedMatrixStep":
                    response.values = pc.koczkodajImprovedMatrixStep(fun.matrix);
                    response.setType("matrix");
                    break;
                case "AIJaddMatrices":
                    response.values = pc.AIJaddPCExplore(fun.matrix);
                    response.setType("matrix");
                    break;
                case "AIJgeomMatrices":
                    response.values = pc.AIJgeomPCExplore(fun.matrix);
                    response.setType("matrix");
                    break;
                case "AIJaddVectors":
                    response.values = pc.AIJaddPCExplore(fun.vector, fun.column);
                    response.setType("vector");
                    break;
                case "AIJgeomVectors":
                    response.values = pc.AIJgeomPCExplore(fun.vector, fun.column);
                    response.setType("vector");
                    break;
                case "harkerMatrixPlaceHolderCount":
                    response.values = pc.harkerMatrixPlaceHolderCount(fun.matrix, fun.row);
                    response.setType("double");

                    break;
                case "harkerMatrix":
                    response.values = pc.harkerMatrix(fun.matrix);
                    response.setType("matrix");

                    break;
                case "errorMatrix":
                    response.values = pc.errorMatrix(fun.matrix, fun.vector);
                    response.setType("matrix");

                    break;
                case "localDiscrepancyMatrix":
                    response.values = pc.localDiscrepancyMatrix(fun.matrix, fun.vector);
                    response.setType("matrix");

                    break;
                case "globalDiscrepancy":
                    response.values = pc.globalDiscrepancy(fun.matrix, fun.vector);
                    response.setType("double");

                    break;
                case "cop1ViolationList":
                    response.values = pc.cop1ViolationList(fun.matrix, fun.vector);
                    response.setType("matrix");

                    break;
                case "cop1Check":
                    response.values = pc.cop1Check(fun.matrix, fun.vector);
                    response.setType("int");

                    break;
                case "cop2ViolationList":
                    response.values = pc.cop2ViolationList(fun.matrix, fun.vector);
                    response.setType("matrix");

                    break;
                case "cop2Check":
                    response.values = pc.cop2Check(fun.matrix, fun.vector);
                    response.setType("int");

                    break;
                case "kendallTauDistance":
                    response.values = pc.kendallTauDistance(fun.vector, fun.vectorB);
                    response.setType("double");

                    break;
                case "normalizedKendallTauDistance":
                    response.values = pc.normalizedKendallTauDistance(fun.vector, fun.vectorB);
                    response.setType("double");

                    break;
                case "consistentMatrixFromRank":
                    response.values = pc.consistentMatrixFromRank(fun.vector);
                    response.setType("matrix");

                    break;
                case "rankOrder":
                    pc.rankOrder(fun.vector);
                    response.setType("vector");

                    break;
                default:
                    break;
            }

        } catch(Exception e){
            String error = e.toString();
            String myError;
            System.out.println(error);
            if(error.contains("main.out.pl.edu.agh.talaga.PcMatrixException")){
               String[] temp = error.split(": ");
                myError = temp[1];
                response.error = myError;
            } else {
                response.error = "Bad parameters of function";
            }
            response.setType("error");
        }
        System.out.println(response);

        return response;
      //  return new ResponseEntity<Function>(fun, HttpStatus.OK);
    }

}
