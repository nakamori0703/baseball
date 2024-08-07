/**
 * フォアボールに関するアウトカムを表す具象クラス
 * フォアボールの結果を返す
 */
public class Walk extends BaseballOutcome {

    @Override
    public String getOutcome() {
        return "フォアボール";
    }
}
