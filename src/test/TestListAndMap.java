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
			System.out.println("OK����");
		} else if (checkEnum == CheckEnum.NG) {
			System.out.println("NG����");
		}
	}
	
	private static enum CheckEnum {
		OK,
		NG,
		OK_NG,
	}
}
/*
HashMap�N���X�̃R���X�g���N�^
�R���X�g���N�^
����
HashMap( )
�����e��(16)�A���׌W��(0.75)�̋��HashMap���쐬���܂��B
HashMap(Map)
�����Ɏw�肳�ꂽMap�̗v�f��ێ�����HashMap���쐬���܂��B
HashMap(int)
�����Ɏw�肵���e�ʂ̋��HashMap���쐬���܂��B
HashMap(int, float)
�����Ɏw�肵���e�ʂƕ��׌W�������A���HashMap���쐬���܂��B
��HashMap�̓n�b�V���e�[�u���̃L�[���ڐ����e�ʂƕ��׌W�����������l���������ꍇ�ɁA�e�ʂ��2�{�ɑ��₵�܂��B���׌W���̃f�t�H���g�l0.75�́A�����̏ꍇ�ɂ����ēK�؂Ȓl�ł���A����قǕύX����������l�ł͂Ȃ���API���t�@�����X�ɋL�ڂ���Ă��܂��B

TreeMap�N���X�̃R���X�g���N�^
�R���X�g���N�^
����
TreeMap( )
�v�f�̎��R�����t���ɏ]���ă\�[�g���ꂽ�A���TreeMap���쐬���܂��B
TreeMap(Map)
�����Ɏw�肳�ꂽMap�̗v�f�������A�v�f�̎��R�����t���ɏ]���ă\�[�g���ꂽTreeMap���쐬���܂��B
TreeMap(Comparator)
�����Ɏw�肳�ꂽComparator�ɏ]���ă\�[�g���ꂽ�A���TreeMap���쐬���܂��B
TreeMap(SortedMap)
�����Ɏw�肳�ꂽSortedMap�Ɠ����v�f�A���������t�������A�V����TreeMap���쐬���܂��B

LinkedHashSet�N���X�̃R���X�g���N�^
�R���X�g���N�^
����
LinkedHashMap( )
�����e��(16)�A���׌W��(0.75)�̋�̑}����LinkedHashMap���쐬���܂��B
LinkedHashMap(Map)
�����Ɏw�肳�ꂽMap�̗v�f��ێ������}����LinkedHashMap���쐬���܂��B
LinkedHashMap(int)
�����Ɏw�肵���e�ʂ̋�̑}����LinkedHashMap���쐬���܂��B
LinkedHashMap(int, float)
�����Ɏw�肵���e�ʂƕ��׌W�������A��̑}����LinkedHashMap���쐬���܂��B
LinkedHashMap(int, float, boolean)
*/