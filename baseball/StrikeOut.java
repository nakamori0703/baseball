/**
 * 三振に関するアウトカムを表す具象クラス
 * 三振の結果を返す
 */
public class StrikeOut extends BaseballOutcome {

    @Override
    public String getOutcome() {
        return "三振";
    }
}
