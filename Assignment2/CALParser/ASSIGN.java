/* Generated By:JJTree: Do not edit this line. ASSIGN.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASSIGN extends SimpleNode {
  public ASSIGN(int id) {
    super(id);
  }

  public ASSIGN(CALParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(CALParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=7f7f08dbec971471e2d1610da319d9a2 (do not edit this line) */
