function shon

global registr;
global commandCounter ;
h = figure('Units', 'pixels', 'Position', [400 200 600 400], 'Resize', 'off', 'ToolBar','none', 'MenuBar', 'none');
toolBar = uitoolbar(h);
imgFileOpen = double(imread('file_open.png'))/65536;
imgFileOpen(imgFileOpen==0)=0.9;
pFileOpen = uipushtool(toolBar, 'ClickedCallback', @openFile,'Separator','on');
pFileOpen.CData = imgFileOpen;
imgFileSave = double(imread('file_save.png'))/65536;
imgFileSave(imgFileSave==0)=0.9;
pFileSave = uipushtool(toolBar, 'ClickedCallback', @saveFile);
pFileSave.CData = imgFileSave;
labelCommandBox = uicontrol('Style', 'text', 'Position', [50 360 100 20], 'String', 'Commands');
commandBox = uicontrol('Style','edit', 'Position', [10 40 200 300], 'HorizontalAlignment', 'left', 'Max', 2);
startBtn = uicontrol('Style', 'pushbutton', 'String', 'Start', 'Position', [70 10 50 25], 'Callback', @run);
tableArray = zeros(1, 1000);
table = uitable(h,'Data', tableArray, 'Position', [230 300 370 60], 'UserData', 'array', 'ColumnEditable', true(size(tableArray)));
macrosField = uicontrol('Style','edit', 'Position', [230 40 370 250], 'HorizontalAlignment', 'left', 'Max', 2);
resultText = uicontrol('Style', 'text', 'Position', [230 10 200 20], 'String', 'Result', 'BackgroundColor', 'w', 'HorizontalAlignment', 'left', 'FontSize', 12);

commandCounter = 0;
registr = 0;

function openFile(~,~)
 [file,path] = uigetfile('*.txt');
 f=fopen([path '' file],'rt');
 [fls,n]=fscanf(f,'%s');
 frewind(f);
if n>0
  for i=1:n
    str= fgetl(f);
    ns=length(str);
    for j=1:ns
      fls1(i,j)=str(j);
    end
  end
end
fclose(f); 

 commandBox.String = fls1;
 disp(commandBox.String); 
  
end

function saveFile(~,~)
fileID = fopen('test.txt','w');
text = (get(commandBox,'string'));
fprintf(fileID,text);
disp(text);
fclose(fileID);
end


function parse(~,~)
text = (get(commandBox,'string'));
numOfRows = size(text, 1); 
commandsCounter = 0;

for i = 1 : numOfRows
line = text(i,:);

if(strfind(line, "INC") == 1)
    [name,command] = strtok(line,' ');
    command = strtrim(command);
    command = strtok(command,";"); 
    table.Data(str2num(command)) = table.Data(str2num(command)) +1;
    commandsCounter = commandsCounter + 1;   
end    

if(strfind(line, "DEC") == 1)
    [name,command] = strtok(line,' ');    
    command = strtrim(command);  
    [i,n] = strtok(command,',');
    n = strtok(n,";");
    n = strtok(n,",");
    
    if(table.Data(str2num(i)) > 0)
      table.Data(str2num(i)) = table.Data(str2num(i))-1;
      commandsCounter = n;
    end 
    if(table.Data(str2num(i)) == 0)
     commandsCounter = commandsCounter + 1;
    end
    
end 
end
end

function run(~,~)
parse();
end

end
