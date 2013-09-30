package test;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

public class TestListAndMap {
    enum ANIMAL { DOG, CAT}
    
	public static void main(String args[]){
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("Test", "List1");
		map.put("Ugougo", "Test2");
		
		System.out.println("key:"+"Test");
		System.out.println("key:"+map.get("Test"));
		
		Set<String> set = new HashSet<String>();
		set.add("Test123");
		set.add("hoge123");
		set.add("345test");
		set.add("678jhoge");
		
		for(String e : set) {
			System.out.println("Value:"+ e);
		}
		
		checkFlag(CheckEnum.OK);
	}
	
	private static void checkFlag(CheckEnum checkEnum) {
		if (checkEnum == CheckEnum.OK) {
			System.out.println("OKっす");
		} else if (checkEnum == CheckEnum.NG) {
			System.out.println("NGっす");
		}
	}
	
	private static enum CheckEnum {
		OK,
		NG,
		OK_NG,
	}
}
/*
HashMapクラスのコンストラクタ
コンストラクタ
説明
HashMap( )
初期容量(16)、負荷係数(0.75)の空のHashMapを作成します。
HashMap(Map)
引数に指定されたMapの要素を保持したHashMapを作成します。
HashMap(int)
引数に指定した容量の空のHashMapを作成します。
HashMap(int, float)
引数に指定した容量と負荷係数を持つ、空のHashMapを作成します。
※HashMapはハッシュテーブルのキー項目数が容量と負荷係数をかけた値を上回った場合に、容量を約2倍に増やします。負荷係数のデフォルト値0.75は、多くの場合において適切な値であり、それほど変更を検討する値ではないとAPIリファレンスに記載されています。

TreeMapクラスのコンストラクタ
コンストラクタ
説明
TreeMap( )
要素の自然順序付けに従ってソートされた、空のTreeMapを作成します。
TreeMap(Map)
引数に指定されたMapの要素を持ち、要素の自然順序付けに従ってソートされたTreeMapを作成します。
TreeMap(Comparator)
引数に指定されたComparatorに従ってソートされた、空のTreeMapを作成します。
TreeMap(SortedMap)
引数に指定されたSortedMapと同じ要素、同じ順序付けをもつ、新しいTreeMapを作成します。

LinkedHashSetクラスのコンストラクタ
コンストラクタ
説明
LinkedHashMap( )
初期容量(16)、負荷係数(0.75)の空の挿入順LinkedHashMapを作成します。
LinkedHashMap(Map)
引数に指定されたMapの要素を保持した挿入順LinkedHashMapを作成します。
LinkedHashMap(int)
引数に指定した容量の空の挿入順LinkedHashMapを作成します。
LinkedHashMap(int, float)
引数に指定した容量と負荷係数を持つ、空の挿入順LinkedHashMapを作成します。
LinkedHashMap(int, float, boolean)
*/