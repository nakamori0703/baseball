/**
 * ヒットに関するアウトカムを表す具象クラス
 * ヒットの種類（ツーベースヒット、スリーベースヒット、ホームラン）をランダムに決定
 */
public class Hit extends BaseballOutcome {

    private static final String[] HIT_TYPES = {
        "ヒット",
        "ツーベースヒット",
        "スリーベースヒット",
        "ホームラン"
    };

    @Override
    public String getOutcome() {
        int index = (int) (Math.random() * HIT_TYPES.length);
        return HIT_TYPES[index];
    }
}
