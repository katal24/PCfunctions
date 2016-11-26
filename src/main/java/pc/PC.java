package pc;

import main.out.pl.edu.agh.talaga.PairwiseCompairsons;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dawid on 26.11.16.
 */
@RestController
@EnableAutoConfiguration
public class PC {

    PairwiseCompairsons pc = new PairwiseCompairsons(true);

    @RequestMapping(value="/function", method = RequestMethod.POST)
    public Object update(@RequestBody Function fun){
    //    public ResponseEntity<Function> update(@RequestBody Function fun){

        String name = fun.name;
        System.out.println(name);
        Object result = null;

        switch(name){
            case "principalEigenValue":
                result = pc.principalEigenValue(fun.matrix);
                break;
            case "principalEigenValueSym":
                result = pc.principalEigenValueSym(fun.matrix);
                break;
            case "principalEigenVector":
                result = pc.principalEigenVector(fun.matrix);
                break;
            case "principalEigenVectorSym":
                result = pc.principalEigenVectorSym(fun.matrix);
                break;
            case "saatyIdx":
                result = pc.saatyIdx(fun.matrix);
                break;
            case "saatyIdxSym":
                result = pc.saatyIdxSym(fun.matrix);
                break;
            case "eigenValueRank":
                result = pc.eigenValueRank(fun.matrix);
                break;
            case "eigenValueRankSym":
                result = pc.eigenValueRankSym(fun.matrix);
                break;
//            case "ahp":
//                result = pc.principalEigenValue(fun.matrix);
//                break;
            case "geometricRank":
                result = pc.geometricRank(fun.matrix);
                break;
            case "geometricRescaledRank":
                result = pc.geometricRescaledRank(fun.matrix);
                break;
            case "getMatrixEntry":
                result = pc.getMatrixEntry(fun.matrix, fun.row, fun.column);
                break;
            case "recreatePCMatrix":
                result = pc.recreatePCMatrix(fun.matrix);
                break;
            case "deleteRows":
                result = pc.deleteRows(fun.matrix, fun.list);
                break;
            case "deleteColumns":
                result = pc.deleteColumns(fun.matrix, fun.list);
                break;
            case "deleteRowsAndColumns":
                result = pc.deleteRowsAndColumns(fun.matrix, fun.list);
                break;
            case "setDiagonal":
                result = pc.setDiagonal(fun.matrix, fun.valueToSet);
                break;
            case "HREmatrix":
                result = pc.HREmatrix(fun.matrix, fun.vector);
                break;
            case "HREconstantTermVector":
                result = pc.HREconstantTermVector(fun.matrix, fun.vector);
                break;
            case "HREpartialRank":
                result = pc.HREpartialRank(fun.matrix, fun.vector);
                break;
            case "HREfullRank":
                result = pc.HREfullRank(fun.matrix, fun.vector);
                break;
            case "HRErescaledRank":
                result = pc.HRErescaledRank(fun.matrix, fun.vector);;
                break;
            case "HREgeomMatrix":
                result = pc.HREgeomMatrix(fun.matrix, fun.vector);
                break;
            case "HREgeomConstantTermVector":
                result = pc.HREgeomConstantTermVector(fun.matrix, fun.vector);
                break;
            case "HREgeomIntermediateRank":
                result = pc.HREgeomIntermediateRank(fun.matrix, fun.vector);
                break;
            case "HREgeomPartialRank":
                result = pc.HREgeomPartialRank(fun.matrix, fun.vector);
                break;
            case "HREgeomFullRank":
                result = pc.HREgeomFullRank(fun.matrix, fun.vector);
                break;
            case "HREgeomRescaledRank":
                result = pc.HREgeomRescaledRank(fun.matrix, fun.vector);
                break;
            case "koczkodajTriadIdx":
                result = pc.koczkodajTriadIdx(fun.vector);
                break;
            case "koczkodajTheWorstTriad":
                result = pc.koczkodajTheWorstTriad(fun.matrix);
                break;
            case "koczkodajTheWorstTriads":
                result = pc.koczkodajTheWorstTriads(fun.matrix, fun.numberOfTriads);
                break;
            case "koczkodajIdx":
                result = pc.koczkodajIdx(fun.matrix);
                break;
            case "koczkodajConsistentTriad":
                result = pc.koczkodajConsistentTriad(fun.vector);
                break;
            case "koczkodajImprovedMatrixStep":
                result = pc.koczkodajImprovedMatrixStep(fun.matrix);
                break;
//            case "principalEigenValue":   AIJ
//                result = pc.principalEigenValue(fun.matrix);
//                break;
//            case "principalEigenValue":
//                result = pc.principalEigenValue(fun.matrix);
//                break;
//            case "principalEigenValue":
//                result = pc.principalEigenValue(fun.matrix);
//                break;
//            case "principalEigenValue":
//                result = pc.principalEigenValue(fun.matrix);
//                break;
            case "harkerMatrixPlaceHolderCount":
                result = pc.harkerMatrixPlaceHolderCount(fun.matrix, fun.row);
                break;
            case "harkerMatrix":
                result = pc.harkerMatrix(fun.matrix);
                break;
            case "errorMatrix":
                result = pc.errorMatrix(fun.matrix, fun.vector);
                break;
            case "localDiscrepancyMatrix":
                result = pc.localDiscrepancyMatrix(fun.matrix, fun.vector);
                break;
            case "globalDiscrepancy":
                result = pc.globalDiscrepancy(fun.matrix, fun.vector);
                break;
            case "cop1ViolationList":
                result = pc.cop1ViolationList(fun.matrix, fun.vector);
                break;
            case "cop1Check":
                result = pc.cop1Check(fun.matrix, fun.vector);
                break;
            case "cop2ViolationList":
                result = pc.cop2ViolationList(fun.matrix, fun.vector);
                break;
            case "cop2Check":
                result = pc.cop2Check(fun.matrix, fun.vector);
                break;
            case "kendallTauDistance":
                result = pc.kendallTauDistance(fun.vector, fun.vectorB);
                break;
            case "normalizedKendallTauDistance":
                result = pc.normalizedKendallTauDistance(fun.vector, fun.vectorB);
                break;
            case "consistentMatrixFromRank":
                result = pc.consistentMatrixFromRank(fun.vector);
                break;
            case "rankOrder":
                pc.rankOrder(fun.vector);
                break;
            default:
                break;
        }

        return result;
      //  return new ResponseEntity<Function>(fun, HttpStatus.OK);
    }

}
