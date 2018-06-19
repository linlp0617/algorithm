package algorithm;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;

public class InsertSort {
	public void insertSort() {

		int a[] = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 5, 4, 62,
				99, 98, 54, 56, 17, 18, 23, 34, 15, 35, 25, 53, 51 };

		int temp = 0;

		for (int i = 1; i < a.length; i++) {

			int j = i - 1;

			temp = a[i];

			for (; j >= 0 && temp < a[j]; j--) {

				a[j + 1] = a[j]; // 将大于temp的值整体后移一个单位

			}

			a[j + 1] = temp;

		}

		for (int i = 0; i < a.length; i++)

			System.out.println(a[i]);

	}
	
	public void mySort(){
		int[] num ={ 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 5, 4, 62,
				99, 98, 54, 56, 17, 18, 23, 34, 15, 35, 25, 53, 51 };
		int temp = 0;
		for(int i =0;i<num.length-1;i++){
			temp = num[i+1];
			int j = i;
			for(;j>=0&&temp<num[j];j--){
				num[j+1]=num[j];
			}
			num[j+1] = temp;
		}
		for (int i = 0; i < num.length; i++)

			System.out.println(num[i]);
	}
	public static void main(String[] args) {
//		new InsertSort().mySort();
		String s="[{\"type\":\"城际高速\",\"station\":\"北京南\",\"stationNO\":\"1\",\"days\":\"1\",\"arriveTime\":\"-\",\"startDriveTime\":\"08:45\",\"km\":\"0\"},{\"type\":\"城际高速\",\"station\":\"天津\",\"stationNO\":\"2\",\"days\":\"1\",\"arriveTime\":\"09:15\",\"startDriveTime\":\"-\",\"km\":\"120\"}]"; 
		String s2 = JSONArray.toJSONString(s);
		System.out.println(s2);
		String s3 = "{\"a\":\"a\",\"b\":null}";
//		String s3 = "{\"appAccessToken\":\"69aeef40aa552330ff03fec66291e0bc\",\"appID\":\"6274d276-cd82-4db0-8ba8-9670db4c54ab\",\"businessType\":\"4\",\"currency\":\"0\",\"manageAccount\":[{\"accountId\":\"cs22222\",\"mgeAcctMobile\":\"18795876028\",\"mgeAcctDigest\":\"\",\"pwd\":[{\"pwdType\":\"\",\"encryMode\":\"03\",\"password\":\"5vlW3Ypuarg=\",\"pwdFactor\":\"EDEqMY0fKQeax3qx4e3qgpnUs76YWiiSpFToBMCdvwqYpS+K0ZzFX5t3VJUpjv9C3fsIQnb1in5aBZKOI4I7oUxzwgZx3IKZbYKd1PXhiORYbbgXiUiL+seHMhHKn1SRuPlxqSmkD6KM7WEyaf1srcyFYmOQ6nGCFJ7Ue5pBcJg=\",\"serial\":\"15265479056377238\",\"macValue\":\"075E4868FE8B4A82\"}],\"mobile\":\"18795876028\"}],\"instructionCode\":\"46747\",\"digest\":\"123321\",\"freeTransNum\":\"3\",\"freeTransInfo\":[{\"freeTransCode\":\"92703\",\"freeFlag\":\"1\",\"freePeriod\":\"10\",\"freeAmount\":\"10000\"},{\"freeTransCode\":\"92706\",\"freeFlag\":\"1\",\"freePeriod\":\"10\",\"freeAmount\":\"888\"},{\"freeTransCode\":\"92707\",\"freeFlag\":\"1\",\"freePeriod\":\"180\",\"freeAmount\":\"1000\"}],\"version\":\"V3.0.0.27\",\"systemType\":\"4\",\"bkInst\":[{\"bkInstitutionId\":\"a1\",\"bkInstitutionType\":\"1\"}],\"svInst\":[{\"svBranchId\":\"\",\"svBranchName\":\"\",\"svInstitutionId\":\"P0011000\",\"svInstitutionName\":\"\",\"svInstitutionType\":\"0\",\"svSubBranchId\":\"\",\"svSubBranchName\":\"\"}],\"reqRef\":[{\"reference\":\"15265479056377238\"}],\"isLast\":\"N\",\"sign\":\"6B53FEC314A129A1F71176577C04407C\",\"random\":\"123456\"}";
		JSONObject json = JSONObject.parseObject(s3,Feature.OrderedField);
		System.out.println(json);
		Object o = json.get("b");
		if(o == null){
			System.out.println(111);
			System.out.println( "2:"+o.toString());
		}
		if (o instanceof JSONArray){
//			System.out.println("1:"+JSONArray.toJSONString(o));
			System.out.println( "2:"+o.toString());
		}
		

	}
}
