public class Shorttran {
  public static void main(String[] args) {
    short s = 1;
    // S = s + 1;
    /**
     * 出现编译失败 s和1做运算的时候，1是int类型，s会被提升为int类型 s+1后的结果是int类型，将结果在赋值会short类型时发生错误
     * short内存2个字节，int类型4个字节 必须将int强制转换为short才能完成赋值
     */
    short S;
    S = (short) (s + 1);
    // s = (short) (s + 1);
    System.out.println(S);

    // $tc_id = DB::table('liantong_orders_tc')->where('card_num', $v->card_name)->value('tc_id');
    //       $tc_cid = DB::table('card_items')->where('id', $tc_id)->value('cid');
    //       $tc_name = DB::table('card_type')->where('id', $tc_cid)->value('name');

    // select liantong_orders_tc.tc_id,card_items.cid,card_type.name,from
    // liantong_orders_tc left join card_items on
    // liantong_orders_tc.card_name=$v->card_name as name left join card_items on
    // card_items.id=name as id left join card_type on card_type.id =id;
  }
}