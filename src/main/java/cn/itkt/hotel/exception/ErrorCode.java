package cn.itkt.hotel.exception;

public class ErrorCode {

	/** 数据库层异常 */
	public static final String DAO_ERROR = "db-00001";

	/** 接口请求异常 */
	public static final String HOTEL_ERROR = "sys-00001";
	/** 艺龙请求异常 */
	public static final String HOTEL_EL_ERROR = "el-00001";

	/** 令牌错误 */
	public static final String TOKEN_ERROR = "info-00001";
	/** 信用卡重复 */
	public static final String CREDITCARD_REPEAT_ERROR = "info-00002";
	/** CityId、HotelId、HotelName同时为空 */
	public static final String CHECK_ERROR = "info-00003";
	/** DistrictId、CommercialLocationId、LandmarkLocationID中有一个不为空时，CityId不能为空 */
	public static final String CHECK_CITY_ID_ERROR = "info-00004";
	/** 无效终端ID */
	public static final String TERMINAL_ID_ERROR = "info-00005";
	/** orderId与lcdOrderId同时为空 */
	public static final String CHECK_ORDER_ID = "info-00006";
	/** 信用卡卡号错误 */
	public static final String CHECK_CREDITCARD_ERROR = "info-00007";
	/** 信用卡错误 */
	public static final String CREDITCARD_ERROR = "info-00008";
	/** 酒店不存在 */
	public static final String HOTEL_NOT_EXIST = "info-00009";
	/** 酒店满房 */
	public static final String HOTEL_FULL_BOOK = "info-00010";
	/** 没有订单 */
	public static final String NO_ORDER = "info-00011";
	/** 请求参数错误 */
	public static final String PARAM_ERROR = "info-00012";
	/** 该酒店已收藏 */
	public static final String FAVORITE_EXIST = "info-00013";
	/** 收藏酒店成功 */
	public static final String FAVORITE_SUCCESS = "info-00014";
	/** 暂无评论 */
	public static final String NO_COMMENT = "info-00015";
	/** 无效酒店ID */
	public static final String FAVORITE_ERROR_HOTELID = "info-00016";
}
