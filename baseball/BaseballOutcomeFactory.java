/**
 * ランダムに野球のアウトカムを生成するファクトリークラス
 * ヒット、三振、フォアボール、アウトのいずれかのアウトカムをランダムに生成
 */
public class BaseballOutcomeFactory extends Object{

    /**
     * ランダムにアウトカムを生成
     * 
     * @return 野球のアウトカムを表すBaseballOutcomeのインスタンス
     */
    public static BaseballOutcome createRandomOutcome() {
        int random = (int) (Math.random() * 7);
        
        if (random < 4) {
            return new Hit();
        } else if (random == 4) {
            return new StrikeOut();
        } else if (random == 5) {
            return new Walk();
        } else {
            return new Out();
        }
    }
}
