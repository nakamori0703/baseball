/**
 * 野球のアウトカムを表す抽象クラス
 * 各アウトカム（ヒット、三振、フォアボールなど）の基本的な動作を定義
 */
public abstract class BaseballOutcome extends Object {

    /**
     * アウトカムを取得する抽象メソッド
     * サブクラスで具体的なアウトカムの内容を実装
     * 
     * @return アウトカムの文字列
     */
    public abstract String getOutcome();
}
