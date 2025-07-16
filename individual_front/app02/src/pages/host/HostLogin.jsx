const { useEffect } = require("react");

const API_SERVER = process.env.REACT_APP_SERVER_ROOT;

const FullContainer = styled.div`
  display  : flex;
  height: 866px;
  justify-content: center;
  align-items: center;
`;

useEffect(()=> {
  if (!document.getElementById('daum-postcode-script'))
})